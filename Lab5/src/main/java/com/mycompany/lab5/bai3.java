/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
class SanPham {
    String ten;
    Double gia;
    public SanPham(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }
    @Override
    public String toString() {
        return String.format("%-10s - %.2f", ten, gia);
    }
}
public class bai3 {
    static ArrayList<SanPham> ds=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("+------------------------------------------+");
            System.out.println("| *** *** ***  MENU CHUC NANG  *** *** *** |");
            System.out.println("+------------------------------------------+");
            System.out.println("| 1. Nhap danh sach san pham               |");
            System.out.println("| 2. Xuat danh sach sap xep giam dan       |");
            System.out.println("| 3. Xoa san pham nhap tu ban phim         |");
            System.out.println("| 4. Xuat gia trung binh cua cac san pham  |");
            System.out.println("| 5. Ket thuc                              |");
            System.out.println("+------------------------------------------+");
            System.out.print("Ban chon chuc nang? ");
            chon=sc.nextInt();
            sc.nextLine();
            switch(chon) {
                case 1: System.out.println("Ban chon: Nhap danh sach san pham");
                    nhap();
                    break;
                case 2: System.out.println("Ban chon: Xuat danh sach sau khi sap xep giam dan");
                    xuat();
                    break;
                case 3: System.out.println("Ban chon: Xoa san pham nhap tu ban phim");
                    xoa();
                    break;
                case 4: System.out.println("Ban chon: Xuat gia trung binh cua cac san pham");
                   trungbinh();
                   break;
                case 5:
                    System.out.println("Ket thuc chuong trinh. Tam biet va hen gap lai!");
                    break;
                default: 
                    System.out.println("Chon sai. Vui long chon lai (1-5)");
                    break;
            }
        } while(chon!=5);
    }
    public static void nhap() {
        int i=0;
        while(true) {
            System.out.println("Nhap sp thu "+(i+1)+": ");
            System.out.print("Nhap ten sp: ");
            String ten=sc.nextLine();
            System.out.print("Nhap gia sp: ");
            Double gia=sc.nextDouble();
            sc.nextLine();
            ds.add(new SanPham(ten, gia));
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
        Comparator<SanPham> comp=new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return o2.gia.compareTo(o1.gia);
            }
        };
        Collections.sort(ds, comp);
        for(SanPham sp:ds) {
            System.out.println(sp);
        }
        System.out.println("");
    }
    public static void xoa() {
        System.out.print("Nhap ten sp can xoa: ");
        String ten=sc.nextLine();
        boolean xoa=false;
        for(int i=0;i<ds.size();i++) {
            if(ds.get(i).ten.equals(ten)) {
                ds.remove(i);
                xoa=true;
                System.out.println("Da xoa sp "+ten);
                break;
            }
        }
        if(!xoa) {
            System.out.println("Khong tim thay sp");
        }
        System.out.println("");
    }
    public static void trungbinh() {
        double tong=0;
        for(SanPham sp:ds) {
            tong+=sp.gia;
        }
        double tb=tong/ds.size();
        System.out.println("Gia tb cua cac sp la: "+tb);
        System.out.println("");
    }
}
