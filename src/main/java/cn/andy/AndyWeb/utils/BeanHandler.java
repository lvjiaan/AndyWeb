package cn.andy.AndyWeb.utils;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class BeanHandler implements ResultSetHandler {


    //要封装成⼀个Bean对象，⾸先要知道Bean是什么，这个也是调⽤者传递进来的。
    private Class clazz;

    public BeanHandler(Class clazz) {
        this.clazz = clazz;
    }


    @Override
    public Object hanlder(ResultSet resultSet) {
        try {
            //创建传进对象的实例化
            Object bean = clazz.newInstance();
            if (resultSet.next()) {
                //拿到结果集元数据
                ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
                for (int i = 0; i < resultSetMetaData.getColumnCount(); i++) {
                    //获取到每列的列名
                    String columnName = resultSetMetaData.getColumnName(i + 1);
                    //获取到每列的数据
                    String columnData = resultSet.getString(i + 1);
                    //设置Bean属性
                    Field field = clazz.getDeclaredField(columnName);
                    field.setAccessible(true);
                    field.set(bean, columnData);
                }
                //返回Bean对象
                return bean;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}