package main.love.cong.LineSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static main.love.cong.LineSQL.JDBCSQL.getConnectionl;

public class LoginSQL {
    //查询登录数据数据
    public UserInfo1 LoginSQL(String username, String password) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = getConnectionl(); // 获取数据库连接
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?"; // 查询数据的SQL语句
            // 登陆成功的提示
            pst = conn.prepareStatement(sql); // 创建PreparedStatement对象
            pst.setString(1, username); // 设置查询条件中的用户名
            pst.setString(2, password); // 设置查询条件中的密码

            rs = pst.executeQuery(); // 运行SQL查询语句，返回查询数据的结果集
            if (rs.next()) { // 如果查询到数据
                // 获取对应的值
                int ID = rs.getInt("ID"); // 职工编号
                String office = rs.getString("office");

                // 返回用户信息
                return new UserInfo1(ID, username, password, office);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 打印堆栈跟踪以便调试
        } finally {
            // 关闭ResultSet、PreparedStatement和Connection，防止资源泄露
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null; // 如果未查询到数据，返回null
    }
    public static boolean updateUserPassword(String username, String newPassword) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = getConnectionl(); // 获取数据库连接
            String sql = "UPDATE login SET password = ? WHERE username = ?"; // 更新数据的SQL语句
            pst = conn.prepareStatement(sql); // 创建PreparedStatement对象
            pst.setString(1, newPassword); // 设置新的密码
            pst.setString(2, username); // 设置用户名

            int rowsUpdated = pst.executeUpdate(); // 执行更新语句，返回更新的行数

            return rowsUpdated > 0; // 如果更新行数大于0，表示更新成功
        } catch (SQLException e) {
            e.printStackTrace(); // 打印堆栈跟踪以便调试
        } finally {
            // 关闭PreparedStatement和Connection，防止资源泄露
            try {
                if (pst != null) pst.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false; // 如果未成功更新，返回false
    }

    static class UserInfo1 {
        private int ID;
        private String username;
        private String password;
        private String office;

        public UserInfo1(int ID, String username, String password, String office) {
            this.ID = ID;
            this.username = username;
            this.password = password;
            this.office = office;
        }
    }
}
