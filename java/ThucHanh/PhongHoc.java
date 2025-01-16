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
public class PhongHoc {

    private String soPhong;
    private String loaiPhong;
    private int tang;
    private float dienTich;

    public void nhapPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so Phong: ");
        this.soPhong = sc.nextLine();
        System.out.print("Nhap loai phong: ");
        this.loaiPhong = sc.nextLine();
        System.out.print("Nhap so tang: ");
        this.tang = sc.nextInt();
        System.out.println("Nhap dien tich: ");
        this.dienTich = sc.nextFloat();sc.nextLine();
    }

    public PhongHoc() {
    }
    

    public void xuatPhong() {
        System.out.println("\nPhong: " + this.soPhong + " Loai phong:" + this.loaiPhong);
        System.out.println("\nTang: " + this.tang + " Dien tich:" + this.dienTich);
    }
}
