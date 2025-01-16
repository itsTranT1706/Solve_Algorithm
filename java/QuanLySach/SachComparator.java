/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLySach;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class SachComparator implements Comparator<Sach>{
    public int compare(Sach s1,Sach s2){
        if(s1.thanhTien()==s2.thanhTien())
        {
            return 0;          
        }
        else if(s1.thanhTien()<s2.thanhTien()){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
