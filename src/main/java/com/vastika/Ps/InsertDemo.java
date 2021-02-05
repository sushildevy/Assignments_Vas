package com.vastika.Ps;

import com.vastika.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertDemo {
    public static final String SQL="insert into demo_tbl(user_name,password) values(?,?)";

    public static void main(String[] args) {

        try (
                PreparedStatement pst= DBUtil.getConnection().prepareStatement(SQL);
        ) {
            pst.setString(1,"Nepali");
            pst.setString(2,"NiNi");
            pst.executeUpdate();
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
