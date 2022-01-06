/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcelManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN 
 * 
 * 
 */
public class QuanLySp extends SanPham {

    List<SanPham> list = new ArrayList<SanPham>();
    public String thongbao = null;

    public void AddWord(String sp, String loaisp, double gia) {
        list.add(new SanPham(sp, loaisp, gia));
    }


    public void ReadData() {
        String sp;
        String loaisp;
        String code;
        try {
            BufferedReader br = new BufferedReader(new FileReader("sanpham.txt"));
            while (br != null) {
                String line = br.readLine();
                String[] value = line.split(";");
                sp = value[0];
                loaisp = value[1];
                code = value[2];
                list.add(new SanPham(sp, loaisp, gia));
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void WriteData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("sanpham.txt"));
            for (SanPham x : list) {
                writer.write(x.getSp() + ";" + x.getLoaisp() + ";" + x.getGia());
                writer.newLine(); 
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Traloaisp() {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai san pham:");
        String a = sc.nextLine();
        for (SanPham w : list) {
            if (w.getLoaisp().contains(a)) {
                System.out.printf("San pham : " + w.getSp() + "\nGiÃ¡ :" + w.getGia() + "\n");
            }           
        }      
    }

    public void Trasp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap san pham:");
        String x = sc.nextLine();
        for (SanPham w : list) {
            if (w.getSp().contains(x)) {
                System.out.printf("Loai san pham :" + w.getLoaisp() + "\nGia : " + w.getGia() + "\n");
            }
        }      
    }
    

    public void Themsp() {
        Scanner sc = new Scanner(System.in);
        String tt;
        do {
            System.out.println("Nhap ten san pham:");
            String sp = sc.nextLine();
            System.out.println("Nhap loai san pham:");
            String loaisp = sc.nextLine();
            System.out.println("Nhap gia san pham:");
            Double gia = sc.nextDouble();
            list.add(new SanPham(sp, loaisp, gia));
            WriteData();
            System.out.println("Nhan Y|y de them san pham");
            tt = sc.nextLine();
        } while (tt.equals("y") || tt.equals("y"));
    }

    public String Xoasp() {
        Scanner sc = new Scanner(System.in);
        thongbao = null;
        System.out.println("Nhap ten san pham muon xoa");
        String x = sc.nextLine();
        for (SanPham w : list) {
            if (w.getSp().contains(x) || w.getLoaisp().contains(x)) {
                list.remove(w);
                WriteData();
                return thongbao = "Da xoa!!!";
            }
        }
        return thongbao = "San pham khong ton tai!!!";
    }

public String Chinhsua(){
    Scanner sc = new Scanner(System.in);
    thongbao = null;
    System.out.println("Nhap ten san pham muon sua");
    String x = sc.nextLine();
    for(SanPham w : list){
        if(w.getSp().contains(x)||w.getLoaisp().contains(x)){
            list.remove(w);
            Themsp();
            return thongbao = "Chinh sua thanh cong";
        }
    }
    return thongbao = "San pham khong ton tai!!!";
}

    public void PrintSp() {
        for (SanPham x : list) {
            System.out.printf("%20s%20s%20s\n", x.getSp(), x.getLoaisp(), x.getGia());
        }
    }
    
}
// TODO code application logic here

     
