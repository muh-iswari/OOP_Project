/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.database;

import java.sql.SQLException;
import com.config.MyConnection;
import com.reference.Product;
import java.util.ArrayList;

public class DataBase extends MyConnection {
    public static void getDatabase() {
        conn();
        try {
            query = "SELECT Nama,Harga,Jumlah FROM `tb_barang`ORDER BY ID DESC";
            preparedStatement = connect.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("Nama") + ": Rp." +
                                resultSet.getString("Harga") + " (" +
                                resultSet.getString("Jumlah") + ")");

            }
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static void readDB() {
        conn();
        try {
            query = "SELECT Nama, Harga, Jumlah FROM `tb_barang` ORDER BY ID DESC ";
            preparedStatement = connect.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString("Nama") + ": Rp." +
                                resultSet.getString("Harga") + " (" +
                                resultSet.getString("Jumlah") + ")");

            }
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
    public static boolean insertDB(String product, Long harga, Integer stok) {
        conn();
        query = "INSERT INTO `tb_barang` (Nama, Harga, Jumlah) VALUES (?, ?, ?)";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, product);
            preparedStatement.setLong(2, harga);
            preparedStatement.setInt(3, stok);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }
    
    public static void updateNamaDB(int id, String name) {
        conn();
        query= "UPDATE `tb_barang` SET Nama=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateHargaDB(int id, Long harga) {
        conn();
        query= "UPDATE `tb_barang` SET Harga=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setLong(1, harga);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateStokDB(int id, Integer stok) {
        conn();
        query= "UPDATE `tb_barang` SET Jumlah=? WHERE ID=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setInt(1, stok);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static boolean deletDB(String nama) {
        conn();
        query= "DELETE FROM `tb_barang` WHERE Nama=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, nama);
            int rowDelete = preparedStatement.executeUpdate();
            if (rowDelete>0) {
                return true;
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
       public static void deleteDB() {
        conn();
        query= "DELETE FROM `tb_barang`";
        try {
            preparedStatement = connect.prepareStatement(query);
            int rowDelete = preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
    public static Product getProdukbyNama(String nama){
        Product produk = null;
        conn();
        query = "SELECT * FROM `tb_barang` WHERE Nama=?";
        try {
            preparedStatement = connect.prepareStatement(query);
            preparedStatement.setString(1, nama);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                produk = new Product(resultSet.getInt("ID"), resultSet.getString("NAMA"), resultSet.getInt("HARGA"), resultSet.getInt("STOK"));
            }
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return produk;
    }
    
    public static void insertDB(ArrayList<Product> listProduct) {
        conn();
        query = "INSERT INTO `tb_barang` (Nama, Harga, Jumlah) VALUES (?, ?, ?)";
        try {
            for (int i = 0; i<listProduct.size();i++) {
                preparedStatement = connect.prepareStatement(query);
                preparedStatement.setString(1, listProduct.get(i).getName());
                preparedStatement.setInt(2, listProduct.get(i).getPrice());
                preparedStatement.setInt(3, listProduct.get(i).getStock());
                preparedStatement.executeUpdate();
            }
            preparedStatement.close();

//           
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}

