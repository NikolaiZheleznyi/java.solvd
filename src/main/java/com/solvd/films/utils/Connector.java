package com.solvd.films.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connector {
    private final String url = "jdbc:postgresql://localhost:5432/SammerLab";
    private final String user = "Nikolai";
    private final String password = "123";

    public Connection connect(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to PostgreSQL server");
        }catch (SQLException e){
            System.out.println("Error to connecting to PostgreSQL server");
            e.printStackTrace();
        }
        return conn;
    }

}
