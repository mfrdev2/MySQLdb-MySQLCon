package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Connection con = Database.databaseCon("studentdb");
        Statement statement = con.createStatement();
        PreparedStatement preparedStatement = con.prepareStatement("insert into studentinfo values (?,?,?)");
        preparedStatement.setInt(1,2);
        preparedStatement.setString(2,"SDQ");
        preparedStatement.setString(3,"Gazipur");
        preparedStatement.execute();
        ResultSet resultSet = statement.executeQuery("Select * from studentinfo");
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1) +" "+resultSet.getString(2)+" "+resultSet.getString(3));
        }
        con.close();
    }
}
