/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AT18.De566;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Dictionary {
    private ArrayList<Word> danhSach = new ArrayList<>();

    public Dictionary() {
        danhSach.add(new Word("001", "one", "1"));
        danhSach.add(new Word("002", "two", "2"));
        danhSach.add(new Word("003", "three", "3"));
        danhSach.add(new Word("004", "four", "4"));
        danhSach.add(new Word("005", "five", "5"));
        danhSach.add(new Word("006", "six", "6"));
        danhSach.add(new Word("007", "seven", "7"));
        danhSach.add(new Word("008", "eight", "8"));
        danhSach.add(new Word("009", "nine", "9"));
        danhSach.add(new Word("010", "ten", "10"));
        danhSach.add(new Word("01", "cat", "con meo"));
    }

    public Dictionary(ArrayList<Word> danhSach) {
        this.danhSach = danhSach;
    }

    public ArrayList<Word> getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList<Word> danhSach) {
        this.danhSach = danhSach;
    }
    
    public void tuDien() {
        
    }
}
