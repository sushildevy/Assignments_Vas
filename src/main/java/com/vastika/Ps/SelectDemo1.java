package com.vastika.Ps;

import com.vastika.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo1 {
    public static final String SQL="select * from demo_tbl where id =?";

    public static void main(String[] args) {

        try (
                PreparedStatement pst= DBUtil.getConnection().prepareStatement(SQL);
        ) {
            pst.setInt(1,1);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
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
