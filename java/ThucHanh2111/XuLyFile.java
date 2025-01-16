/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh2111;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Admin
 */
public class XuLyFile {

    public static void luuFile(ArrayList<NhanVien> dsNV) throws FileNotFoundException, IOException {
     File fName = new File("dsNhanVien.dat");
        FileOutputStream fout = new FileOutputStream(fName);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(dsNV);
        out.close();
        fout.close();
    }
    public static ArrayList<NhanVien> docFile() throws FileNotFoundException, IOException, ClassNotFoundException {
        File fName = new File("dsNhanVien.dat");
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        FileInputStream fin = new FileInputStream(fName);
        ObjectInputStream in = new ObjectInputStream(fin) ;
        dsNV = (ArrayList<NhanVien>)in.readObject();
        in.close();
        fin.close();
        return dsNV;
    }
    
}
