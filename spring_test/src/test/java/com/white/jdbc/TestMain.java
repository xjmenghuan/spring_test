package com.white.jdbc;

import org.junit.Test;

import java.sql.*;

public class TestMain {
    @Test
    public void test1() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","root");

        PreparedStatement ps = connection.prepareStatement("select * from tb_resume");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1)+rs.getString(2));
        }
    }
}
