/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcelManagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public Menu(){
int choice;
QuanLySp w = new QuanLySp();
w.ReadData(); 
do{
System.out.printf("======MENU=======\n");
System.out.printf("1/In san pham \n");
System.out.printf("2/Tra cuu san pham \n");
System.out.printf("3/Them san pham\n");
System.out.printf("4/Xoa san pham\n");
System.out.printf("5/Sua san pham\n");
System.out.printf("6/Save\n");
System.out.printf("7/Quan ly hoa don\n");
System.out.printf("8/Exit\n");
System.out.printf("------------------\n");
System.out.printf("Chon chuc nang thuc hien:");
Scanner sc = new Scanner(System.in);
choice = sc.nextInt();
switch (choice){
case 1: w.PrintSp(); break;
case 2: w.Trasp();break; 
case 3: w.Themsp();break; 
case 4: w.Xoasp();
        System.out.println(w.thongbao);   
        break; 
case 5: w.Chinhsua();
        System.out.println(w.thongbao);
        break;
case 6: w.WriteData();
case 7: quanly();break;
default: System.out.println("chon sai chuc nang\n");
}
}
while (choice !=8);
}

    public void quanly(){
        Scanner scanner = new Scanner(System.in);
        int n; 
        HoaDon hoaDon;
         
    
        ArrayList<HoaDon> arrHoadon = new ArrayList<>();
         
        System.out.println("Nhap so luong khach hang: ");
        n = Integer.parseInt(scanner.nextLine());
         
        for (int i = 0; i < n; i++) {
        	hoaDon = new HoaDon();
            System.out.println("Nhap thong tin khach hang thu " + (i+1) + ":");
            hoaDon.nhapThongTinCanQuanLy();
            arrHoadon.add(hoaDon);
        }
         
     
        for (int i = 0; i < arrHoadon.size(); i++) {
            System.out.println("\nThong tin khach hang thu " + (i+1) + ": ");
            arrHoadon.get(i).hienThiThongTinCanQuanLy();
        }
         
      
        System.out.println("\nNhan y de xac nhan tinh tien: ");
        String xn = scanner.nextLine();
        for (int i = 0; i < arrHoadon.size(); i++) {
                System.out.println("So tien = " + arrHoadon.get(i).tinhTien());
            }
        
        }
    }
