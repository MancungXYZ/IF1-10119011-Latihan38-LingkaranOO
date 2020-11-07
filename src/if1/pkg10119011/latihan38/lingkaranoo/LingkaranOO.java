/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan38.lingkaranoo;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class LingkaranOO {
    public double diameter, jariJari, luas, keliling;
    public double phi = 3.14;
    
    public double hitungJariJari () {
        jariJari = diameter / 2 ;
        return jariJari;
    }
    
    public double hitungLuas () {
        luas = phi * diameter;
        return luas;
    }
    
    public double hitungKeliling () {
        keliling = 2 * phi * jariJari;
        return keliling;
    }
}
