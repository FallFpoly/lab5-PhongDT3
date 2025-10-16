/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {
    
    public static void main(String[] args) {
        ArrayList<Double> ds= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int i=0;
        while(true) {
            System.out.print("Nhap so thu "+(i+1)+": ");
            Double so=sc.nextDouble();
            ds.add(so);
            sc.nextLine();
            System.out.print("Ban muon tiep tuc (Y/N): ");
            String chon=sc.nextLine();
            if(chon.equalsIgnoreCase("N")) {
                break;
            }
            i++;
        }
        System.out.println("-----------------------");
        for(int j=0;j<ds.size();j++) {
            System.out.println("So thuc thu "+(j+1)+": "+ds.get(j));
        }
    }
}
