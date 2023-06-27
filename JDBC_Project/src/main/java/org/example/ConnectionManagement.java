package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManagement {
    static Connection  connect;
    public static Connection createConnection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String username = "root";
            String password = "kazuaki2004";
            String url = "jdbc:mysql://localhost:3306/student_information";
            connect = DriverManager.getConnection(url,username,password);

        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return connect;
    }
}
