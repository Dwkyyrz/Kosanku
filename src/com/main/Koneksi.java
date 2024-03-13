package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        

public class Koneksi {
    private static Connection mysql;
    public static Connection koneksiDB()throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/kosanku"; //url database
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysql=DriverManager.getConnection(url, user, pass);        
        }
        catch ( Exception e){
            System.err.println("Koneksi gagal"+e.getMessage());
        }
        return mysql;
    }
}
