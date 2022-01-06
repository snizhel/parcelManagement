/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParcelManagement;

/**
 *
 * @author ADMIN
 */
public class SanPham {
    public String sp;
    public String loaisp;
    public double gia;

    public SanPham() {
    }

    public SanPham(String sp, String loaisp, double gia) {
        this.sp = sp;
        this.loaisp = loaisp;
        this.gia = gia;
    }


    public String getSp() {
        return sp;
    }

    public void setLoaisp(String sp) {
        this.sp = sp;
    }

    public String getLoaisp() {
        return loaisp;
    }

    public void setSp(String Sp) {
        this.sp = sp;
    }

    public double getGia() {
        return gia;
    }

    public double setGia(Double Gia) {
        this.gia = gia;
        return 0;
    }

    @Override
    public String toString() {
        return sp + ";" + loaisp + ";" + gia; //To change body of generated methods, choose Tools | Templates.
    }
    public boolean equals(Object obj){
        return(obj instanceof SanPham)?(((SanPham)obj).getSp()==this.sp):false;
    }  
}

