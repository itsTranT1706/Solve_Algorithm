/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De566;

/**
 *
 * @author admin
 */
public class NhanVien extends Person {
    private String phongBan;
    private double heSoLuong;
    private int thamNien;
    private int luongCoBan;
    private int luongThucLinh;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, double heSoLuong, int thamNien, int luongCoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
        this.luongThucLinh = (int)Math.round(this.luongCoBan * this.heSoLuong * (1 + 1.0 * this.thamNien / 100));
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getThamNien() {
        return thamNien;
    }

    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(int luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    @Override
    public String toString() {
        String s = super.toString();
        return "NhanVien{" + s + "phongBan=" + phongBan + ", heSoLuong=" + heSoLuong + ", thamNien=" + thamNien + ", luongCoBan=" + luongCoBan + ", luongThucLinh=" + luongThucLinh + '}';
    }
}
