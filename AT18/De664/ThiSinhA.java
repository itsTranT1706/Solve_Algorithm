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
public class ThiSinhA extends ThiSinh {
    private double toan, ly, hoa;

    public ThiSinhA() {
    }

    public ThiSinhA(String hoTen, String ngaySinh, String diaChi, double toan, double ly, double hoa) {
        super(hoTen, ngaySinh, diaChi);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    
    public double tongDiem() {
        return toan + ly + hoa;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap diem toan: ");
        this.toan = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem ly: ");
        this.ly = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem hoa: ");
        this.hoa = Double.parseDouble(sc.nextLine());
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Khoi A");
        System.out.println("Diem toan: " + this.toan + ", Diem ly: " + this.ly + ", Diem hoa: " + this.hoa);
    }
}
