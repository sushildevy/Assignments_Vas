package com.vastika.Statement;

import com.vastika.util.DBUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static final String SQL="update demo_tbl set user_name='Sushil',password='NN' where id=2";

    public static void main(String[] args) {

        try (
                Statement st= DBUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data updated");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
