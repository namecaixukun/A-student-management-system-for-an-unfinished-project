package main.love.cong.LineSQL;


import java.sql.*;

import static java.sql.DriverManager.getConnection;

public class JDBCSQL {
    static final String url ="jdbc:mysql://127.0.0.1:3306/management";
    static final String SQLuser = "Management";
    static final String SQLpassword = "123456";
    static Connection conn;//全局变量
    static Statement st;

    public static Connection getConnectionl(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, SQLuser, SQLpassword);
        } catch (ClassNotFoundException e) {
            System.out.println("驱动加载失败");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
            throw new RuntimeException(e);
        }
        return conn;
    }

}
