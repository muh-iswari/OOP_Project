/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.composition;

import java.sql.SQLException;
import com.config.MyConnection;

public class ReadData extends MyConnection {
    public static void readDataBase() {
        conn();
        try {
            String query = "SELECT * FROM `tb_barang`";
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.printf("%s\t%-15s\tRp. %-10s\tStok: %-5s\n",
                        resultSet.getString("ID"),
                        resultSet.getString("Nama"),
                        resultSet.getString("Harga"),
                        resultSet.getString("Jumlah")
                );
            }
            System.out.println("=".repeat(50));
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
