package com.vastika.Statement;

import com.vastika.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_Demo {
    public static final String SQL="select * from demo_tbl";

    public static void main(String[] args) {

        try (
                Statement st= DBUtil.getConnection().createStatement();
        ) {
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                System.out.println("Id is : "+rs.getInt("id"));
                System.out.println("name is : "+rs.getString("user_name"));
                System.out.println("password is : "+rs.getString("password"));
                System.out.println("========================");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
