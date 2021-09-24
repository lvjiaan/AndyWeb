package cn.lalisa.web.utils;

import java.sql.*;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/5/21 9:17
 * @Modifier：
 * @ModefiedDate:
 */
public class Test {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


            //获取与数据库连接的对象-Connetcion
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lvjiaan", "root", "123456");


            //获取执行sql语句的statement对象
            statement = connection.createStatement();


            //执行sql语句,拿到结果集
            resultSet = statement.executeQuery("SELECT * FROM hhh");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
