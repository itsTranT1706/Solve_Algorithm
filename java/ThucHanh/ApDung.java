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
public class ApDung {
    public static void main(String[] args) {
        Phieu[] dsPhieu;
        int soPhieu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phieu can quan ly: ");
        soPhieu = sc.nextInt();
        dsPhieu = new Phieu[soPhieu];
        for(int i =0;i<soPhieu;i++){
            dsPhieu[i] = new Phieu();
            dsPhieu[i].nhapPhieu();
        }
        for(int i =0;i<soPhieu;i++){           
            dsPhieu[i].xuatPhieu();
            System.out.print("\n-------------------------");
        }
    }
}
