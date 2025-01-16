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
public class CanBo {
    private String hoTen;
    private int tuoi;
    private String diaChi, gioiTinh;

    public CanBo() {
    }

    public CanBo(String hoTen, int tuoi, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
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
    
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhập tên: ");
        this.hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.diaChi = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        this.gioiTinh = sc.nextLine();
    }
    
    public void hienThiThongTin() {
        System.out.println("Ho ten: " + this.hoTen + ", Tuoi: " + this.tuoi + ", Dia chi: " + this.diaChi + ", Gioi tinh: " + this.gioiTinh);
    }
}
