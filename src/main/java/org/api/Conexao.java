package org.api;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/site_db";
    private static final String USER = "root";
    private static final String PASS = "20112016";
    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);

    }

}
