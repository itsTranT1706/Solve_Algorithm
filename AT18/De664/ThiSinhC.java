/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De664;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ThiSinhC extends ThiSinh {
    private double van, su, dia;

    public ThiSinhC() {
    }

    public ThiSinhC(String hoTen, String ngaySinh, String diaChi, double van, double su, double dia) {
        super(hoTen, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public double getSu() {
        return su;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public double getDia() {
        return dia;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }
    
    public double tongDiem() {
        return van + su + dia;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap diem van: ");
        this.van = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem su: ");
        this.su = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem dia: ");
        this.dia = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi C");
        System.out.println("Diem van: " + this.van + ", Diem su: " + this.su + ", Diem dia: " + this.dia);
    }
}
