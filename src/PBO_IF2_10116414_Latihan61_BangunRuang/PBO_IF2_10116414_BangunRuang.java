/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan61_BangunRuang;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan bangun ruang
 */
public class PBO_IF2_10116414_BangunRuang {
    public static void main(String[] args) {
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        
        bola.setJari(7);
        System.out.println("Volume Bola : " + bola.hitungVolume());
        
        tabung.setTinggi(21);
        tabung.setJari(10);
        System.out.println("Volume Tabung : " + tabung.hitungVolume());
        
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("Volume Segitiga Kerucut : " + kerucut.hitungVolume());
    }
}
