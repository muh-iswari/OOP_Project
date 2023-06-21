package com.layout;


import java.util.Scanner;

import com.controllers.DbController;
import com.staticMethod.Frame;

public class DeleteData {
    public static void showDeleteData() {
        Scanner sc = new Scanner(System.in);
       
        Frame.frameA();
        System.out.println("Pilih Data yang Ingin Dihapus");
        Frame.frameA();
        DbController.getDatabase();
        Frame.frameB();
        System.out.println("Penulisan nama data harus sesuai");
        System.out.print("Pilih Nama Produk: ");
        String nama = sc.nextLine();
        Frame.frameA();

        if (DbController.deleteData(nama)) {
            System.out.println("Berhasil Mendelete Data");
        } else {
            System.out.println("Maaf, Gagal Mendelete Data");
        }

        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }
}


