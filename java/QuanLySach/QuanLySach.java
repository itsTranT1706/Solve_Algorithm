/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLySach {
    ArrayList<Sach> listSach = new ArrayList<Sach>();
    public void nhapDS(){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so sach:");n= sc.nextInt();
        for(int i =0; i<n;i++){
            Sach s = new Sach();
            s.nhap();
            listSach.add(s);
            
        }
    }
    public void inDS(){
        System.out.println("Danh sach da nhap: \n");
        for(Sach s:listSach){
            s.xuat();
        }
        System.out.println("------------------------");
    }
    public void tongTien(){
        int t=0;
        for(Sach s: listSach){
            t+= s.thanhTien();
        }
        System.out.println("Tong tien:"+t);
    }
    public void sapXep(){
        Collections.sort(listSach,new SachComparator());
        this.inDS();
    }
}
