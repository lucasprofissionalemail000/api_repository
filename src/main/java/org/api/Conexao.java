package org.api;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public static Connection connection() throws Exception {

        String url  = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String pass = System.getenv("DB_PASS");

        if (url == null || user == null || pass == null) {
            throw new RuntimeException("Variáveis de ambiente do banco não configuradas");
        }

        return DriverManager.getConnection(url, user, pass);
    }
}