/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcelManagement;

import java.util.Scanner;


public class Nguoi {
    private String hoTen;
    private String sdt;
    private String queQuan;
     
    public Nguoi() {
        super();
    }
     
    public Nguoi(String hoTen, String queQuan, String soCMND) {
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.sdt = sdt;
    }
     
    public String getSdt() {
        return sdt;
    }
    public void setSdt(String soCMND) {
        this.sdt = sdt;
    }
     
    public void nhapThongTinKhach() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten khach hang: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        queQuan = scanner.nextLine();
        System.out.print("So dien thoai khach hang: ");
        sdt = scanner.nextLine();
    }
     
    public void hienThiThongTinKhach() {
        System.out.println("Ho va ten khach hang: " + hoTen);
        System.out.println("Dia chi: " + queQuan);
        System.out.println("So dien thoai: " + sdt);
    }

}
