package com.layout;

import java.util.Scanner;

import com.controllers.DbController;
import com.models.Produck;
import com.staticMethod.Frame;

public class EditData {
    public static void showEditData(String nama) {
        Scanner sc = new Scanner(System.in);

        Frame.frameA();
        System.out.println("Pilih Data yang Ingin Diedit");
        Frame.frameA();
        DbController.getDatabase();
        Frame.frameA();
        System.out.println("Penulisan nama data harus sesuai");
        System.out.print("Pilih Nama Produk: ");
        nama = sc.nextLine();
        System.out.println("Pilih Menu Update Data");
        Frame.frameA();
        System.out.println("1] Update Nama");
        System.out.println("2] Update Harga");
        System.out.println("3] Update Jumlah");
        System.out.println("4] Back to Menu");
        Frame.frameA();
        System.out.print("Pilihan : ");
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    showEditNama(nama);
                    break;
                case 2:
                    showEditHarga(nama);
                    break;
                case 3:
                    showEditJumlah(nama);
                    break;
                case 4:
                    Menu.showMenu();
                    break;
                default:
                    Frame.frameA();
                    System.out.println("Maaf nama produk atau menu yang dipilih tidak ditemukan");
                    Frame.frameB();
                    Menu.showMenu();
            }
        } catch (Exception e) {
            Frame.frameA();
            System.out.println("Maaf nama produk atau menu yang dipilih tidak ada");
            Frame.frameB();
            Menu.showMenu();
        }
        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }

    public static void showEditNama(String nama) {
        Scanner sc = new Scanner(System.in);
        Produck produck = DbController.getProdukByNama(nama);

        Frame.frameA();
        System.out.println("Edit Nama");
        Frame.frameA();
        System.out.println("Nama Lama : " + produck.getNama());
        Frame.frameB();
        System.out.print("Nama Baru : ");
        String namaBaru = sc.nextLine();
        DbController.updateNama(produck.getId(), namaBaru);

        Frame.frameA();
        System.out.println("Berhasil Mengupdate Nama");
        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }

    public static void showEditHarga(String nama) {
        Scanner sc = new Scanner(System.in);
        Produck produk = DbController.getProdukByNama(nama);

        Frame.frameA();
        System.out.println("Edit Harga");
        Frame.frameA();
        System.out.println("Harga Lama : " + produk.getHarga());
        Frame.frameB();
        System.out.print("Harga Baru : ");
        long hargaBaru = sc.nextLong();
        DbController.updateHarga(produk.getId(), hargaBaru);

        Frame.frameA();
        System.out.println("Berhasil Mengupdate Harga");
        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }

    public static void showEditJumlah(String nama) {
        Scanner sc = new Scanner(System.in);
        Produck produk = DbController.getProdukByNama(nama);

        Frame.frameA();
        System.out.println("Edit Jumlah");
        Frame.frameA();
        System.out.println("Jumlah Lama : " + produk.getjumlah());
        Frame.frameB();
        System.out.print("Jumlah Baru : ");
        int jumlahBaru = sc.nextInt();
        DbController.updateStok(produk.getId(), jumlahBaru);

        Frame.frameA();
        System.out.println("Berhasil Mengupdate Jumlah");
        Frame.frameB();
        Menu.showMenu();
        sc.close();
    }
}

