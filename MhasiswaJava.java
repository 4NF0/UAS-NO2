/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mhasiswajava;

/**
 *
 * @author nm
 */
public class MhasiswaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa baru = new MahasiswaBaru("Naufal", 20, 22205050);
        baru.displayInfo();

        Mahasiswa lama = new MahasiswaLama("Yusuf", 20, 2022);
        lama.displayInfo();
    }
    
}
