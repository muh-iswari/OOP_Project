/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/db_sisfo";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "";

    protected static Connection connect;
    protected static Statement statement;
    protected static PreparedStatement preparedStatement;
    protected static ResultSet resultSet;
    protected static String query;

    public static void conn() {
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("Connection Success");
            System.out.println("=".repeat(50));
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed");
        }
    }
}
