/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan38.lingkaranoo;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan38LingkaranOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        LingkaranOO lkr = new LingkaranOO();
        
        System.out.println("=====Perhitungan Lingkaran======");
        System.out.print("Masukan nilai diameter : ");
        lkr.diameter = sc.nextDouble();
        
        System.out.println("=====Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-jari Lingkaran = " + lkr.hitungJariJari());
        System.out.println("Luas Lingkaran = " + lkr.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lkr.hitungKeliling());
    }
    
}
