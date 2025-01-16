/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2111;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ApDung {
    public static void main(String[] args) throws IOException,FileNotFoundException, ClassNotFoundException {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        String s1 = "Nguyen Thi Ha$13/4/2000$ThanhXuan-HaNoi$Nu$KhoaCNTT$2.7$10$1800000";
        String s2 = "Nguyen Huy Hoang$23/12/2004$ThanhXuan-HaNoi$Gay$KhoaCNTT$2.5$10$1800000";
        String s3 = "Nguyen Quoc Dai$30/6/2004$ThanhXuan-HaNoi$Nu$KhoaCNTT$2.8$20$1800000";
        NhanVien nv1 = new NhanVien(s1);
        NhanVien nv2 = new NhanVien(s2);
        NhanVien nv3 = new NhanVien(s3);
        dsNV.add(nv1);
        dsNV.add(nv2);
        dsNV.add(nv3);
        
//        for(NhanVien nv : dsNV){
//            nv.xuat();
//        }
//        System.out.println("----------------------------");
//        XuLyFile.luuFile(dsNV);
//        System.out.println("------Luu File roi ne-------");
        
        dsNV = XuLyFile.docFile();
        System.out.println("-----Danh Sach NV tu file----");
        for(NhanVien nv : dsNV){
            nv.xuat();
        }
        
        LuongNVComparator lnv = new LuongNVComparator();
        Collections.sort(dsNV,lnv);
        System.out.println("-----Danh Sach NV da sap xep-----");
        for(NhanVien nv : dsNV){
            nv.xuat();
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten NV can sua he so luong: ");
        String findName = sc.nextLine();
        System.out.print("Nhap he so luong moi: ");
        float newHSL = sc.nextFloat();
        for(NhanVien nv :dsNV){
            if(nv.getHoTen().equals(findName)){
                nv.setHeSoLuong(newHSL);
            }
        }
        for(NhanVien nv : dsNV){
            nv.xuat();
        }
//        
    }
   
    
}
