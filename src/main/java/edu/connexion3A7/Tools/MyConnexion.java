package edu.connexion3A7.Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnexion {
    private Connection con;
    private String url="jdbc:mysql://localhost:3306/3A7";
    private String login="root";
    private String password="";
    private static  MyConnexion instance;
    private MyConnexion() {
        try {
          con=DriverManager.getConnection(url,login,password);
            System.out.println("Connexion established");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getCon() {
        return con;
    }
    public static MyConnexion getInstance() {
        if (instance==null){
            instance =new MyConnexion();
        }
        return instance;
    }
}
