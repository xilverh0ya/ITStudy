package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtil {
	// JDBC ����
    public static Connection getConnection() {
    	Connection conn = null;
        try {
        	String url = "jdbc:mysql://localhost:3306/mini_shop";
        	String id = "root";
        	String pw = "1234";
        	conn = DriverManager.getConnection(url, id, pw);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(PreparedStatement stmt, Connection conn) {
        // JDBC ���� ����
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void close(ResultSet rs, PreparedStatement stmt,
                             Connection conn) {
        // JDBC ���� ����
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
