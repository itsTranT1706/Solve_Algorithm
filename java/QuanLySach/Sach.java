/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private int soLuong;
    private int donGia;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sach: ");this.maSach = sc.nextLine();
        System.out.println("Nhap ten sach: ");this.tenSach = sc.nextLine();
        System.out.println("Nhap so luong sach: ");this.soLuong = sc.nextInt();
        System.out.println("Nhap don gia: ");this.donGia = sc.nextInt();
    }
    public void xuat(){
        System.out.printf("%10s",this.maSach);
        System.out.printf("%15s",this.tenSach);
        System.out.printf("%5d",this.soLuong);
        System.out.printf("%5d",this.donGia);
        System.out.printf("%7d",this.thanhTien());
    }
    public int thanhTien(){
        return this.soLuong*this.donGia;
    }
}
