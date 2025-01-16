/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chuong3;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class TaiXiu {
   private int tienDanh;
   private int[] ketQua = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
   private int tienTra;
   int taixiu;
   
   public int taoKetQua(){
   Random kq = new Random();
   int kqua = kq.nextInt(16);
   int ketqua = ketQua[kqua];
   return ketqua;
   }
   public void taoRa3XucXac(){
       int ketqua = this.taoKetQua();
     
       int xx1 = 0,xx2=0,xx3=0;
       Random xx = new Random();
       
       while(xx2 + xx3 +xx1 != ketqua){
        xx2 = xx.nextInt(6)+1;
        xx3 = xx.nextInt(6)+1;
        xx1 = xx.nextInt(6)+1;
       }
      
       
       System.out.printf("Xuc xac thu 1: %2d",xx1);
       System.out.printf("\nXuc xac thu 2: %2d",xx2);
       System.out.printf("\nXuc xac thu 3: %2d",xx3); 
       System.out.println("\nTong: " + ketqua);
      if(ketqua>10){
               System.out.println("Ket qua: Tai");
           }else {
               System.out.println("Ket qua: Xiu");
           }
   }
   public void getLenhDanh(int tienDanh,int taixiu){
       this.tienDanh = tienDanh;
       this.taixiu = taixiu;
   }
   public int tiLeAn(){
       Random tl = new Random();
       int tiLe = tl.nextInt(99);
       int tiLeMoi =0;
       int tiLeTru =0;
       //ti le bip
       if(this.tienDanh <100000){
           tiLeTru = 10;
       }
       else{
           tiLeTru = this.tienDanh / 10000;
           tiLeTru ++;
       }
       //ap dung ti le Moi voi tham so Tai Xiu
       //Tai 1
       //Xiu 0
       int select = this.taixiu;
       switch(select){
           case 0:
               if(tiLe<50){
                   tiLeMoi = tiLe + tiLeTru;
               }
               break;
           case 1:
               if(tiLe>=50){
                   tiLeMoi = tiLe - tiLeTru;
               }       
       }
       
       
       if (tiLeMoi>50){
           return 1;
       }else
       {
           return 0;
       }    
   }
   public void inKetQua(){
       int tmp = this.tiLeAn();
       if(taixiu == tmp){
           this.tienTra = this.tienDanh*2;
           this.taoRa3XucXac();
           System.out.println("Ban nhan duoc: "+ this.tienTra +" coin");
       }else
       {
           this.taoRa3XucXac();
           System.out.println("\nXit roi");
       }
   }
   public void nhap(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhap Tien Danh: ");
       this.tienDanh = sc.nextInt();
       System.out.print("Nhap Tai(1) hoac Xiu(0): ");
       this.taixiu = sc.nextInt();
   }
   
    
    
}
