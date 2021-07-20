package cn.andy.AndyWeb.utils;


import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Describe:
 * @Author：lvja
 * @Date：2021/5/21 9:49
 * @Modifier：
 * @ModefiedDate:
 */
public class dbutil {
    /*
     * 连接数据库的driver，url，username，password通过配置文件来配置，可以增加灵活性
     * 当我们需要切换数据库的时候，只需要在配置文件中改以上的信息即可
     *
     * */

    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            //获取配置文件的读入流
            InputStream inputStream = dbutil.class.getClassLoader().getResourceAsStream("db.properties");

            Properties properties = new Properties();
            properties.load(inputStream);

            //获取配置文件的信息
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

            //加载驱动类
            Class.forName(driver);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }


    public static void release(Connection connection, Statement statement, ResultSet resultSet) {

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


    public static void update(String sql, Object[] objects) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //根据传递进来的参数，设置SQL占位符的值
            for (int i = 0; i < objects.length; i++) {
                preparedStatement.setObject(i + 1, objects[i]);
            }
            //执⾏SQL语句
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*
         1:对于查询语句来说，我们不知道对结果集进⾏什么操作【常⽤的就是把数据封装成⼀个Bean对象，封装成⼀个List集合】
         2:我们可以定义⼀个接⼝，让调⽤者把接⼝的实现类传递进来
         3:这样接⼝调⽤的⽅法就是调⽤者传递进来实现类的⽅法。【策略模式】
 */
    //这个⽅法的返回值是任意类型的，所以定义为Object。
    public static Object query(String sql, Object[] objects, ResultSetHandler
            rsh) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //根据传递进来的参数，设置SQL占位符的值
            if (objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    preparedStatement.setObject(i + 1, objects[i]);
                }
            }
            resultSet = preparedStatement.executeQuery();
            //调⽤调⽤者传递进来实现类的⽅法，对结果集进⾏操作
            return rsh.hanlder(resultSet);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
