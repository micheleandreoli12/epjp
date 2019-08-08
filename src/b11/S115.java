package b11;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

public class S115 {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
    private static final String USER = "me";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            OracleDataSource ods = new OracleDataSource();
            
            ods.setURL(URL);
            ods.setUser(USER);
            ods.setPassword(PASSWORD);
            
            Connection conn = ods.getConnection();
            System.out.println("Connected as " + conn.getSchema());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
