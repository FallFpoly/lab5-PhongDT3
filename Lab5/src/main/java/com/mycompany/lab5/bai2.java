/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {
    static ArrayList<String> ds=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("+------------------------------------+");
            System.out.println("| **** **** MENU CHUC NANG **** **** |");
            System.out.println("+------------------------------------+");
            System.out.println("| 1. Nhap danh sach ho va ten        |");
            System.out.println("| 2. Xuat danh sach ho va ten        |");
            System.out.println("| 3. Xuat danh sach ngau nhien       |");
            System.out.println("| 4. Xuat danh sach sap xep giam dan |");
            System.out.println("| 5. Xoa ho ten nhap tu ban phim     |");
            System.out.println("| 6. Ket thuc                        |");
            System.out.println("+------------------------------------+");
            System.out.print("Ban chon chuc nang? ");
            chon=sc.nextInt();
            sc.nextLine();
            switch(chon) {
                case 1: System.out.println("Ban chon: Nhap danh sach ho va ten");
                    nhap();
                    break;
                case 2: System.out.println("Ban chon: Xuat danh sach ho va ten");
                    xuat();
                    break;
                case 3: System.out.println("Ban chon: Xuat danh sach ngau nhien");
                    ngaunhien();
                    break;
                case 4: System.out.println("Ban chon: Xuat danh sach sau khi sap xep giam dan");
                    giamdan();
                    break;
                case 5: System.out.println("Ban chon: Xoa ho ten nhap tu ban phim");
                    xoa();
                    break;
                case 6:
                    System.out.println("Ket thuc chuong trinh. Tam biet va hen gap lai!");
                    break;
                default: 
                    System.out.println("Chon sai. Vui long chon lai (1-6)");
                    break;
            }
        } while(chon!=6);
    }
    public static void nhap() {
        int i=0;
        while(true) {
            System.out.println("Nhap nv thu "+(i+1)+": ");
            System.out.print("Nhap ten nv: ");
            String hoten=sc.nextLine();
            ds.add(hoten);
            System.out.print("Ban muon tiep tuc (Y/N): ");
            String chon=sc.nextLine();
            if(chon.equalsIgnoreCase("N")) {
                break;
            }
            i++;
        }
        System.out.println("");
    }
    public static void xuat() {
        for(int i=0;i<ds.size();i++) {
            System.out.println("Nv thu "+(i+1)+": ");
            System.out.println("Ho ten: "+ds.get(i));
        }
        System.out.println("");
    }
    public static void ngaunhien() {
        Collections.shuffle(ds);
        xuat();
    }
    public static void giamdan() {
        Collections.sort(ds, Collections.reverseOrder());
        xuat();
    }
    public static void xoa() {
        System.out.print("Nhap ten nv can xoa: ");
        String ten=sc.nextLine();
        if(ds.remove(ten)) {
            System.out.println("Da xoa nv "+ten);
        } else {
            System.out.println("Khong tim thay nv");
        }
        System.out.println("");
    }
}
