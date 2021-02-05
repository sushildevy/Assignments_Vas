package com.vastika.Statement;

import com.vastika.util.DBUtil;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static final String Driver = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/demo_db";
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "rootp";
    public static final String SQL = "Create table demo_tbl(id int not null auto_increment, user_name varchar(45),password varchar(45), primary key (id) )";

    public static void main(String[] args) {

        try (
                Statement st= DBUtil.getConnection().createStatement();
                 ) {
            st.executeUpdate(SQL);
            System.out.println("Table created");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
