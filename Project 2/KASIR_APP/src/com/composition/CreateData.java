/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.composition;

import java.sql.SQLException;
import java.util.Scanner;
import com.config.MyConnection;

public class CreateData extends MyConnection{
    public static void createDataBase() {
        conn();
        Scanner inputan = new Scanner(System.in);
        
        System.out.println("=".repeat(50));
        System.out.println("INPUT DATA");
        System.out.println("Nama  :");
        String newName = inputan.nextLine();
        System.out.println("Harga :");
        int newPrice = inputan.nextInt();
        System.out.println("Stok  :");
        int newStock = inputan.nextInt();

        try {
            statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO `tb_barang` (`ID`, `Nama`, `Harga`, `Jumlah`) VALUES (NULL, '"+ newName +"', '"+ newPrice +"', '"+ newStock +"')");
            inputan.close();
            statement.close();
            System.out.println("Data berhasil ditambahkan.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}