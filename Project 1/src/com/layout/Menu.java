package com.layout;

import java.util.Scanner;

import com.staticMethod.Frame;

public class Menu {
    public static void showMenu() {
        System.out.println();
        Frame.frameA();
        System.out.println("WELCOME TO - Sabun Sejahtera");
        Frame.frameA();
        Frame.frameB();
        System.out.println("1.] Read Data");
        System.out.println("2.] Insert Data");
        System.out.println("3.] Edit Data");
        System.out.println("4.] Delete Data");
        System.out.println("5.] Exit");
        Frame.frameB();
        System.out.print("Pilih: ");
        selectMenu();
    }

    public static void selectMenu() {
        Scanner sc = new Scanner(System.in);

        try {
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    ReadData.showReadData();
                    break;
                case 2:
                    InsertData.showInsertData();
                    break;
                case 3:
                    EditData.showEditData(null);
                    break;
                case 4:
                    DeleteData.showDeleteData();
                    break;
                case 5:
                    Frame.frameA();
                    System.out.println("Terima Kasih .....");
                    Frame.frameB();
                    System.exit(0);
                default:
                    Frame.frameA();
                    System.out.println("Maaf Menu yang Dipilih Tidak ditemukan");
                    Frame.frameB();
                    showMenu();
            }
        } catch (Exception e) {
            Frame.frameA();
            System.out.println("Maaf, Terjadi Kesalahan");
            Frame.frameB();
            System.exit(0);
        }

        sc.close();
    }
}


