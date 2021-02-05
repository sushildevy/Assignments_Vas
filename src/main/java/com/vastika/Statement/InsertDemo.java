package com.vastika.Statement;

import com.vastika.util.DBUtil;

import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static final String SQL="insert into demo_tbl(user_name,password)values('Shyam','SS')";

    public static void main(String[] args) {

        try (
                Statement st= DBUtil.getConnection().createStatement();
        ) {
            st.executeUpdate(SQL);
            System.out.println("data inserted");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
