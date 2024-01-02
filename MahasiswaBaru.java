/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mhasiswajava;

/**
 *
 * @author nm
 */
public class MahasiswaBaru extends Mahasiswa {

    private int nim;

    public MahasiswaBaru(String nama, int umur, int nim) {
        super(nama, umur);
        this.nim = nim;
    }
    
    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
@Override
    public void displayInfo() {
//        System.out.println("Nama: " + nama);
//        System.out.println("Umur: " + umur);
        super.displayInfo();
        System.out.println("NIM: " + nim);
    }
    
}
