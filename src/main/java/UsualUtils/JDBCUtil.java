package UsualUtils;
import	java.sql.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
    private static String Driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/school";
    private static String user = "root";
    private static String password = "606623";
    private static Connection conn;
    private static Statement st;
    private static PreparedStatement ps;

    static {
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection(url, user, password);
            st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
    }


    //定义静态方法，返回数据库连接对象
    public static Connection getConnection() {
        return conn;
    }

    public static int createDatabase(String databaseName) {
        Connection conn = getConnection();
        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = "create database " + databaseName + " character set UTF-8";
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            return -1;
        } finally {
            close(conn, st);
        }

    }

    public static int createDatabase(String databaseName, String charset) {
        Connection conn = getConnection();
        Statement st = null;
        try {
            st = conn.createStatement();
            String sql = "create database " + databaseName + " character set " + charset;
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            return -1;
        } finally {
            close(conn, st);
        }

    }

    public static int selectDatabase(String databaseName) {
        String sql = "use " + databaseName;
        try {
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            return -1;
        }
    }


    public static void close(AutoCloseable...Closeable) {
        try{
            for (AutoCloseable closeable : Closeable) {
                if (closeable != null) {
                    closeable.close();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("关闭出错");
        }
    }
}
























































