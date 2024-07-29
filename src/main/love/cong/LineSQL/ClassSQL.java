package main.love.cong.LineSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import main.love.cong.LineSQL.UserInfo;


import static main.love.cong.LineSQL.JDBCSQL.getConnectionl;
public class ClassSQL {
    public static List<UserInfo> getAllStudents() {
        List<UserInfo> studentList = new ArrayList<>();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = getConnectionl(); // 获取数据库连接
            String sql = "SELECT * FROM student";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql); // 查询数据的SQL语句
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String domicile = rs.getString("domicile");
                String specialized = rs.getString("specialized");
                studentList.add(new UserInfo(id, name, age, gender, domicile, specialized));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // 打印堆栈跟踪以便调试
        } finally {
            // 关闭ResultSet、Statement和Connection，防止资源泄露
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return studentList;
    }
}
