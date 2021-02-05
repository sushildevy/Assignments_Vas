package com.vastika.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static final String Driver = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "rootp";
    public static final String SQL = "Create database demo_db";

    public static void main(String[] args) {
        Connection con=null;
        Statement st=null;
        try {
            //1. Register the Driver
            Class.forName(Driver);
            //2. Obtain connection object
            con= DriverManager.getConnection(URL,USER_NAME,PASSWORD);
            //obtain statement object
            st=con.createStatement();
            //execute the query
            st.executeUpdate(SQL);
            System.out.println("Database created");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                //5 close the connection
                con.close();
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
