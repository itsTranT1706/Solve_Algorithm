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
public class Phieu {
    private String soPhieu;
    PhongHoc phong;
    private String ngayLap;
    private int n; //so vat tu
    VatTu[] dsVT;
    private String nguoiLap;

    public Phieu() {
    }
    
    public void nhapPhieu(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So Phieu:");
        this.soPhieu = sc.nextLine();
        System.out.print("Nhap Ngay Lap:");
        this.ngayLap = sc.nextLine();
        System.out.print("Nhap Nguoi Lap:");
        this.nguoiLap = sc.nextLine();
        phong = new PhongHoc();
        phong.nhapPhong();
        System.out.print("Nhap so vat tu cua phong hoc:" );
        n= sc.nextInt();sc.nextLine();
        dsVT = new VatTu[n];
        for (int i=0;i<n;i++){
            dsVT[i] = new VatTu();
            dsVT[i].nhapVT();
        }      
    }
    public void xuatPhieu(){
        System.out.println("\nSo Phieu: " + this.soPhieu);
        phong.xuatPhong();
        System.out.println("\nNgay Lap: " + this.ngayLap);
        for(int i =0;i<n;i++){
            dsVT[i].xuatVT();      
        }
        
        System.out.println("\nNguoi Lap: " + this.nguoiLap);
        System.out.println("Tong So Luong:"+ this.tongSoLuong());
        System.out.println("Tong Tien: "+ this.tongTien());
    }
    public int tongSoLuong(){
        int s =0;
        for(int i = 0;i<n;i++){
            s += dsVT[i].getSoLuong();
        }
        return s;
    }
    public float tongTien(){
        float s = 0;
        for(int i=0;i<n;i++){
            s+= dsVT[i].thanhTien();
        }
        return s;
    }
    
    
    
    
}
