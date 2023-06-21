package com.layout;

import java.util.Scanner;

import com.controllers.DbController;
import com.staticMethod.Frame;

public class InsertData {
    public static void showInsertData() {
        Scanner sc = new Scanner(System.in);

        Frame.frameA();
        System.out.println("Silahkan Input Data Produk");
        Frame.frameA();

        System.out.print("Nama : ");
        String name = sc.nextLine();
        System.out.print("Harga : ");
        long harga = sc.nextLong();
        System.out.print("Jumlah : ");
        int stok = sc.nextInt();
        Frame.frameA();

        if (DbController.insertData(name, harga, stok)) {
            System.out.println("Berhasil Menginsert Data");
        } else {
            System.out.println("Gagal Menginsert Data");
        }

        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }
}


