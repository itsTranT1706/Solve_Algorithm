/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De517;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CongNhan extends CanBo {
    private String bac;

    public CongNhan() {
    }

    public CongNhan(String hoTen, int tuoi, String diaChi, String gioiTinh, String bac) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.bac = bac;
    }

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap bac: ");
        this.bac = sc.nextLine();
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Bac: " + this.bac);
    }
}
