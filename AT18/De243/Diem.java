/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De243;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Diem {
    protected double x, y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap diem x: ");
        this.x = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem y: ");
        this.y = Double.parseDouble(sc.nextLine());
    }
    
    public String hienThiThongTin() {
        return "(" + this.x + ", " + this.y + ")";
    }
}
