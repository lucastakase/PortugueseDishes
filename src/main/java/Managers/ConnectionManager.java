package Managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
        private Connection connection;

        public void startConnection() {

            try {
                if (connection == null || connection.isClosed()) {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/portuguese_dishes", "root", "");
                }
            } catch (SQLException ex) {
                System.out.println("Failure to connect to database : " + ex.getMessage());
            }
        }

        public void stopConnection() {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("Failure to close database connections: " + ex.getMessage());
            }
        }

        public Connection getCurrentConnection() {
            startConnection();
            return connection;
        }
    }

