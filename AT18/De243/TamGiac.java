/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De243;

/**
 *
 * @author admin
 */
public class TamGiac {
    private Diem A, B, C;

    public TamGiac() {
    }

    public TamGiac(Diem A, Diem B, Diem C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Diem getA() {
        return A;
    }

    public void setA(Diem A) {
        this.A = A;
    }

    public Diem getB() {
        return B;
    }

    public void setB(Diem B) {
        this.B = B;
    }

    public Diem getC() {
        return C;
    }

    public void setC(Diem C) {
        this.C = C;
    }

    
    public void hienThiThongTin() {
        System.out.println("A" + this.A.hienThiThongTin());
        System.out.println("B" + this.B.hienThiThongTin());
        System.out.println("C" + this.C.hienThiThongTin());
    }
    
    public double tinhDoDai(Diem A, Diem B) {
        return Math.sqrt((B.x - A.x) * (B.x - A.x) + (B.y - A.y) * (B.y - A.y));
    }
    
    public boolean kiemTraTamGiac() {
        double AB = tinhDoDai(A, B);
        double AC = tinhDoDai(A, C);
        double BC = tinhDoDai(B, C);
        
        if(AB > 0 && AC > 0 && BC > 0 && AB + AC > BC && AB + BC > AC && AC + BC > AB)
            return true;
        else
            return false;
    }
}
