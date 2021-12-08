package cn.lalisa.web.dao.base;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import org.apache.ibatis.jdbc.SQL;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Set;

@RestController
public class BaseProvider {
    private static final String GETDATE = "getdate()";
    private static final String SYSDATE = "sysdate";


    public String selectOneKV(String ParamName, String Table, String CondK, String CondV) {
        return new SQL() {
            {
                SELECT(ParamName);
                FROM(Table);
                if (!StrUtil.hasEmpty(CondK)&&!StrUtil.hasEmpty(CondV)) {
                    WHERE(CondK + "= #{CondV}");
                }
            }
        }.toString();
    }

    public String selectOneCondition(String ParamName, String Table, String Condition,String Sort) {
        return new SQL() {
            {
                SELECT(ParamName);
                FROM(Table);
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
                if (!StrUtil.hasEmpty(Sort)) {
                    ORDER_BY(Sort);
                }
            }
        }.toString();
    }

    public String selectOneTableConditionsConditionSQL(String ParamName, String Table, String Condition, String Sort) {
        return new SQL() {
            {
                SELECT(ParamName);
                FROM(Table);
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
                if (!StrUtil.hasEmpty(Sort)) {
                    ORDER_BY(Sort);
                }
            }
        }.toString();
    }


    public String selectOneTableMapSQL(Map<String, Object> map, String Table, String Sort) {
        return new SQL() {
            {
                SELECT("#{ParamName}");
                FROM(Table);
                if (map.get("id") != null) {
                    WHERE("id=#{id}");
                }
                if (!StrUtil.hasEmpty(Sort)) {
                    ORDER_BY(Sort);
                }
            }
        }.toString();
    }

    public String insertSQL(String Table, Map<String, Object> map, String Condition) {
        return new SQL() {
            {
                Set<String> set = map.keySet();
                INSERT_INTO(Table);
                for (String key : set) {
                    if (map.get(key) != null) {
                        String value = map.get(key).toString();
                        if (checkNull(value).equals(GETDATE)) {
                            VALUES(key, value);
                        } else {
                            VALUES(key, "'" + map.get(key).toString().replaceAll("\'","\'\'") + "'");
                        }
                    }
                }
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
            }
        }.toString();
    }

    public String insertSQL2(String Table, Map<String, Object> map, String Condition) {
        return new SQL() {
            {
                Set<String> set = map.keySet();
                INSERT_INTO(Table);
//                String add = "";
                for (String key : set) {
                    if (map.get(key) != null) {
                        String value = map.get(key).toString();
                        if (checkNull(value).equals("getdate()")) {
                            VALUES(key, value);
                        } else {
                            VALUES(key, "'" + map.get(key).toString().replaceAll("\'","\'\'") + "'");
                        }
                    }
//                    add = add + key + "='" + checkNull((String) map.get(key)) + "',";
//                    INTO_COLUMNS(key);
//                    if (isValidDate((String) map.get(key))){
//                        INTO_VALUES("to_date('"+checkDate((String) map.get(key))+"','yyyy-mm-dd hh24:mi:ss')");
//                    }else {
//                        INTO_VALUES("'" + checkNull((String) map.get(key)) + "'");
//                    }
                }
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
            }
        }.toString();
    }


    public String insertSQL3(String Table, Map<String, String> map, String Condition) {
        return new SQL() {
            {
                Set<String> set = map.keySet();
                INSERT_INTO(Table);
                for (String key : set) {
                    String value = map.get(key).toString();
                    if (checkNull(value).equals("getdate()")) {
                        VALUES(key, value);
                    } else {
                        VALUES(key, "'" + map.get(key).replaceAll("\'","\'\'") + "'");
                    }
                }
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
            }
        }.toString();
    }


    public static String checkDate(String str) {
        DateTime parse = DateUtil.parse(str, "yyyy-MM-dd HH:mm:ss");
        return DateUtil.format(parse, "yyyy-MM-dd HH:mm:ss");
    }

    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            convertSuccess = false;
        }
        return convertSuccess;
    }


    public String SqlStr(String SQL) {
        return SQL;
    }


    /**
     * 通用update语句
     *
     * @param Table     表名
     * @param map
     * @param Condition Condition为where条件 例如 name=张三，
     * @Title: updateSQL
     * @return: java.lang.String
     * @Author: cz
     * @Date: 2020/1/9
     * @modifier:
     * @modifyContent:
     **/
    public String updateSQL(String Table, Map<String, Object> map, String Condition) {
        return new SQL() {
            {
                Set<String> set = map.keySet();
                UPDATE(Table);
                String add = "";
                for (String key : set) {
                    if (map.get(key) != null) {
                        String value = map.get(key).toString();
                        if (checkNull(value).equals(GETDATE)) {
                            VALUES(key, value);
                            add = add + key + "=" + checkNull(value) + ",";
                        } else {
                            add = add + key + "='" + checkNull(value) + "',";
                        }
                    }
                }
                add = add.substring(0, add.length() - 1);
                SET(add);
                if (!StrUtil.hasEmpty(Condition)) {
                    WHERE(Condition);
                }
            }
        }.toString();
    }


    /**
     * 有指定键值对判断条件的更新语句
     *
     * @param Table
     * @param changeMap
     * @param conditionMap
     * @return
     * @Author:lvja
     */
    public String updateByCondition(String Table, Map<String, Object> changeMap, Map<String, Object> conditionMap) {
        return new SQL() {
            {
                Set<String> changeSet = changeMap.keySet();
                Set<String> conditionSet = conditionMap.keySet();
                UPDATE(Table);
                String add = "";
                for (String key : changeSet) {
                    add = add + key + "='" + checkNull((String) changeMap.get(key)) + "',";
                }
                add = add.substring(0, add.length() - 1);
                SET(add);

                String condition = "";
                for (String key : conditionSet) {
                    condition = condition + key + "='" + checkNull((String) conditionMap.get(key)) + "' and";
                }
                condition = condition.substring(0, condition.length() - 3);
                WHERE(condition);
            }
        }.toString();
    }


    /**
     * 检验字段是否为空或者null
     *
     * @param str
     * @Title: checkNull
     * @return: java.lang.String
     * @Author: cz
     * @Date: 2020/2/28
     * @modifier:
     * @modifyContent:
     **/
    public String checkNull(String str) {
        String returnStr = "";
        if (!StrUtil.hasEmpty(str) && !"null".equals(str)) {
            returnStr = str.replaceAll("\'","\'\'");
        }
        return returnStr;
    }

    /**
     * create by: cz
     * description: TODO 清空表数据
     * create time: 2020/11/27 10:16
     *
     * @return java.lang.String
     * @Param: table
     */
    public String truncateTable(String table) {
        return "TRUNCATE TABLE" + table;
    }

    /**
     * create by: cz
     * description: TODO 条件删除数据
     * create time: 2020/11/27 10:25
     *
     * @return java.lang.String
     * @Param: tableName
     * @Param: Condition
     */
    public String deleteData(String tableName, String Condition) {
        return new SQL() {{
            DELETE_FROM(tableName);
            if (!StrUtil.hasEmpty(Condition)) {
                WHERE(Condition);
            }
        }}.toString();
    }

    /**
     * 通过map传入多个条件查得数据
     *
     * @param param
     * @param TableName
     * @param conditionMap
     * @return
     * @Author lvja
     */
    public String selectParamByTableNameAndConditions(String param, String TableName, Map<String, String> conditionMap) {
        return new SQL() {
            {
                SELECT("#{param}");
                FROM(TableName);
                String condition = "";
                for (String key : conditionMap.keySet()) {
                    condition = condition + key + "='" + checkNull(conditionMap.get(key)) + "' AND";
                }
                condition = condition.substring(0, condition.length() - 3);
                WHERE(condition);
            }
        }.toString();
    }


    public String getRowCount(String TableName){
        String database=TableName.split("\\.")[0];
        return "USE "+database+";" +
                "SELECT rows FROM sysindexes WHERE id = OBJECT_ID('"+TableName+"') AND indid < 2";
    }


}
