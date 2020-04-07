package DBRealtive.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtil {
    private static String url = "jdbc:mysql://localhost:3306/system";
    private static String username = "root";
    private static String password = "606623";
    private static Connection conn;
    private static PreparedStatement ps;
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (conn == null){
            try {
                conn = DriverManager.getConnection(url, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    @Test
    public void Tets() throws SQLException {

    }

    public static void close(AutoCloseable...closeables) {
        for (AutoCloseable closeable : closeables) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}










































