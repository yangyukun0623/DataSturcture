package DBRealtive;


import DBRealtive.utils.JDBCUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn = JDBCUtil.getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from student";
        ResultSet rs = st.executeQuery(sql);
        rs.last();
        System.out.println(rs.getRow());

    }
}















