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
public class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, String diaChi, String gioiTinh, String nganhDaoTao) {
        super(hoTen, tuoi, diaChi, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
    
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap nganh dao tao: ");
        this.nganhDaoTao = sc.nextLine();
    }
    
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nganh dao tao: " + this.nganhDaoTao);
    }
}
