package org.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection connection() throws Exception {

        String url  = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String pass = System.getenv("DB_PASS");

        if (url == null) {
            throw new RuntimeException("problemas na url");
        }
        if (user == null) {
            throw new RuntimeException("problemas no usuario");
        }
        if (pass == null) {
            throw new RuntimeException("problemas na senha");
        }

        return DriverManager.getConnection(url, user, pass);
    }
}
