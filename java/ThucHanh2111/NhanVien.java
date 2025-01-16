/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2111;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class NhanVien implements Serializable{

    private String hoTen, ngaySinh, diaChi, gioiTinh;
    private String phongBan;
    private float heSoLuong;
    private float thamNien;
    static float luongCoBan = 1800000;

    public NhanVien(String s) {
    String[] tmp = s.split("\\$");
    this.hoTen = tmp[0];
    this.ngaySinh = tmp[1];
    this.diaChi = tmp[2];
    this.gioiTinh = tmp[3];
    this.phongBan = tmp[4];
    this.heSoLuong = Float.parseFloat(tmp[5]);
    this.thamNien = Float.parseFloat(tmp[6]);
    luongCoBan = Float.parseFloat(tmp[7]);
   
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public float getThamNien() {
        return thamNien;
    }

    public void setThamNien(float thamNien) {
        this.thamNien = thamNien;
    }

    public static float getLuongCoBan() {
        return luongCoBan;
    }

    public static void setLuongCoBan(float luongCoBan) {
        NhanVien.luongCoBan = luongCoBan;
    }

    public NhanVien() {
    }
    public void xuat(){
        System.out.printf("%15s|",this.hoTen);
        System.out.printf("%15s|",this.ngaySinh);
        System.out.printf("%15s|",this.diaChi);
        System.out.printf("%4s|",this.gioiTinh);
        System.out.printf("%10s|",this.phongBan);
        System.out.printf("%5.2f|",this.heSoLuong);
        System.out.printf("%5.2f|",this.thamNien);
        System.out.printf("%5.2f|",this.luongCoBan);
        System.out.printf("%5.2f|",this.luongThucLinh());
        System.out.println("");
        
    }
    public float luongThucLinh(){
        return luongCoBan*this.heSoLuong*(1+this.thamNien/100);
    }
   
}
