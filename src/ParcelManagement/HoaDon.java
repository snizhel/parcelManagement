/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcelManagement;

import java.util.Scanner;


public class HoaDon {
    private int sp;
    private String loaisp;
    private double gia;
    private Nguoi nguoi;    
    public HoaDon() {
        super();
    }
    public HoaDon(int soSanPham, String loaiSanpham, double gia, Nguoi nguoi) {
        super();
        this.sp = soSanPham;
        this.loaisp = loaiSanpham;
        this.gia = gia;
        this.nguoi = nguoi;
    }
     
    public Nguoi getNguoi() {
        return nguoi;
    }
    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner scanner = new Scanner(System.in);
         
     
        nguoi = new Nguoi();
        nguoi.nhapThongTinKhach();
         
        System.out.print("Nhap so luong: ");
        sp = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap loai: ");
        loaisp = scanner.nextLine();
        System.out.print("Nhap gia: ");
        gia = scanner.nextDouble();
    }
     
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhach();
        System.out.println("So luong san pham: " + sp);
        System.out.println("Loai: " + loaisp);
        System.out.println("Gia: " + gia);
    }
    public double tinhTien() {
        return sp * gia;
    }
}
