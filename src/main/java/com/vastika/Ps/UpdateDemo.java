package com.vastika.Ps;

import com.vastika.util.DBUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL="update demo_tbl set user_name=?, password=? where id=?";

    public static void main(String[] args) {

        try (
                PreparedStatement pst= DBUtil.getConnection().prepareStatement(SQL);
        ) {

            pst.setString(1,"Suhana");
            pst.setString(2,"SiSi");
            pst.setInt(3,1);
            pst.executeUpdate();
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
