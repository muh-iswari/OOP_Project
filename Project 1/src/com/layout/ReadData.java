package com.layout;

import java.util.Scanner;

import com.controllers.DbController;
import com.staticMethod.Frame;

public class ReadData {
    public static void showReadData() {
        Scanner sc = new Scanner(System.in);

        Frame.frameA();
        System.out.println("Data Produk");
        Frame.frameA();
        DbController.getDatabase();
        Frame.frameA();

        System.out.println("1] Menu");
        System.out.println("2] Exit");
        System.out.print("Pilihan: ");
        // sc.nextInt();
        try {
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    Menu.showMenu();
                    break;
                case 2:
                    Frame.frameA();
                    System.out.println("Terima Kasih .....");
                    Frame.frameB();
                    System.exit(0);
                default:
                    Frame.frameA();
                    System.out.println("Inputan tidak valid");
                    Frame.frameB();
                    Menu.showMenu();
                    System.exit(0);
                    break;
            }
        } catch (Exception e) {
            Frame.frameA();
            System.out.println("Maaf, Terjadi Kesalahan");
            Frame.frameB();
            System.exit(0);
        }

        Frame.frameB();
        Menu.showMenu();

        sc.close();
    }
}

