/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.*;

public class SQL_CONNECTOR {
    class ConnectDatabase{
        private String url = "jdbc:mysql://localhost:3306/my_database";
        private String user = null;
        private String password = null;
        
        public ConnectDatabase(String user, String password) {
            this.user = user;
            this.password = password;
            
            try {
                Connection conn = DriverManager.getConnection(url, user, password);
                System.out.println("[SQL Success] MySQL successfully binded to WAMP.");
                conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            } 
        }
    }
}
