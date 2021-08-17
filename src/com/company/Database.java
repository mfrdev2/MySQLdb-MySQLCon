package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
   public static Connection databaseCon(String dataBaseName) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+dataBaseName,"root","root");
        System.out.println("connected");
        return con;
    }

}
