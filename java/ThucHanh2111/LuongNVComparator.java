/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2111;

import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class LuongNVComparator implements Comparator<NhanVien>{
    public int compare(NhanVien nv1, NhanVien nv2){
        if(nv1.luongThucLinh()==nv2.luongThucLinh())
        {
            return 0;          
        }
        else if(nv1.luongThucLinh()<nv2.luongThucLinh()){
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
