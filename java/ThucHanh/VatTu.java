/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class VatTu {

    private String tenVT;
    private String hangSX;
    private String nuocSX;
    private String ngayNhap;
    private int soLuong;
    private float donGia;

    public VatTu(String tenVT, String hangSX, String nuocSX, String ngayNhap, int soLuong, float donGia) {
        this.tenVT = tenVT;
        this.hangSX = hangSX;
        this.nuocSX = nuocSX;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public VatTu() {
    }
    

    public String getTenVT() {
        return tenVT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setTenVT(String tenVT) {
        this.tenVT = tenVT;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    
    public void nhapVT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten vat tu: ");this.tenVT=sc.nextLine();
        System.out.print("Nhap ten hang san xuat: ");this.hangSX=sc.nextLine();
        System.out.print("Nhap ten nuoc san xuat: ");this.nuocSX=sc.nextLine();
        System.out.print("Nhap ngay nhap hang: ");this.ngayNhap=sc.nextLine();
        System.out.print("Nhap so luong hang: ");this.soLuong = sc.nextInt();sc.nextLine();
        System.out.print("Nhap don gia: ");this.donGia = sc.nextFloat();sc.nextLine();       
    }
    public void xuatVT(){
        System.out.printf("\n%15s",this.tenVT);
        System.out.printf("%15s",this.hangSX);
        System.out.printf("%10s",this.nuocSX);
        System.out.printf("%12s",this.ngayNhap);
        System.out.printf("%3d",this.soLuong);
        System.out.printf("%10.0f",this.donGia);
        System.out.printf("%12.0s",this.thanhTien());
             
    }
    public float thanhTien(){
        return this.soLuong * this.donGia;
    }
    
}
