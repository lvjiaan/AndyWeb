package cn.lalisa.web.dao.base;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;
import java.util.Map;

/**
 * 通用Dao层
 */
@DS("datasource187")
public interface BaseDao187 {

    /**
     * 条件通用指定查询单条
     */
    @SelectProvider(type = BaseProvider.class, method = "selectOneKV")
    String selectOneKV(String ParamName,String Table, String CondK, String CondV);

    /**
     * 条件通用指定查询多条
     */
    @SelectProvider(type = BaseProvider.class, method = "selectOneKV")
    List<String> selectListKV(String ParamName, String Table, String CondK, String CondV);


    @SelectProvider(type = BaseProvider.class, method = "SqlStr")
    List<String> selectListSql(String SQL);

    @SelectProvider(type = BaseProvider.class, method = "selectOneCondition")
    String selectOneCondition(String ParamName, String Table, String Condition,String Sort);

    /**
     * 通用SQL查询
     */
    @SelectProvider(type = BaseProvider.class, method = "SqlStr")
    String selectOneSql(String SQL);

    /**
     * 通用SQL查询多条信息(返回map的list)
     */
    @SelectProvider(type = BaseProvider.class, method = "SqlStr")
    List<Map<String, Object>> selectMaps(String SQL);

    @SelectProvider(type = BaseProvider.class, method = "selectOneCondition")
    List<String> selectListCondition(String ParamName, String Table, String Condition,String Sort);

    /**
     * 通用插入
     */
    @InsertProvider(type = BaseProvider.class, method = "insertSQL")
    void insert(String Table, Map<String, Object> map, String Condition);

    /**
     * 通用SQL插入
     */
    @InsertProvider(type = BaseProvider.class, method = "SqlStr")
    void insertSql(String SQL);




    @UpdateProvider(type = BaseProvider.class, method = "updateSQL")
    void update(String Table, Map<String, Object> map, String Condition);


    @UpdateProvider(type = BaseProvider.class, method = "SqlStr")
    void updateSql(String SQL);

    /**
     * 通用清空指定表名
     */
    @DeleteProvider(type = BaseProvider.class, method = "truncateTable")
    void truncate(String table);

    /**
     * 通用删除指定信息
     */
    @DeleteProvider(type = BaseProvider.class, method = "deleteData")
    void delete(String tableName, String Condition);

    @SelectProvider(type = BaseProvider.class, method = "getRowCount")
    int getRowCount(String TableName);

}
