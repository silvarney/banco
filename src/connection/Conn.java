package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda?characterEncoding=utf8";

    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn != null) {
                conn = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                return conn;
            }
            return conn;
        } catch (SQLException e) {
            System.out.println("ERRO: Falha na conexão com o banco de dados");
            e.printStackTrace();
            return null;
        }
    }
}
