/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuaHang;

/**
 *
 * @author Lenovo
 */
public class DienThoai extends HangHoa{
    private double giaSimGhep ;

    public DienThoai() {
    }

    public DienThoai(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }

    public DienThoai(double giaSimGhep, String tenHang, String maHang, double giaNhap, double giaBan) {
        super(tenHang, maHang, giaNhap, giaBan);
        this.giaSimGhep = giaSimGhep;
    }

    public double getGiaSimGhep() {
        return giaSimGhep;
    }

    public void setGiaSimGhep(double giaSimGhep) {
        this.giaSimGhep = giaSimGhep;
    }
    

    @Override
    public double loiNhuan() {
        return super.loiNhuan() - giaSimGhep; 
    }

    @Override
    public String toString() {
        return super.toString() + ", giaSimGhep : " + giaSimGhep + ", loiNhuan " + loiNhuan(); 
    }

    

    
    
    
    
    
    

    
    
    
}
