/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuaHang;

/**
 *
 * @author Lenovo
 */
public class MayTinhBang extends HangHoa{
    private String kichThuocManHinh ;

    public MayTinhBang() {
    }

    public MayTinhBang(String kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public MayTinhBang(String kichThuocManHinh, String tenHang, String maHang, double giaNhap, double giaBan) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public String getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(String kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    @Override
    public double loiNhuan() {
        return super.loiNhuan(); 
    }

    @Override
    public String toString() {
        return super.toString() + ", kichThuocManHinh " + kichThuocManHinh + ", loiNhuan " + loiNhuan(); 
    }

    
    
    
}
