/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_modul2;

/**
 *
 * @author RENDI
 */
public class praktikum_testbus1 {
    public static void main(String[] args) {
           praktikum_bus1 busmini = new praktikum_bus1(10);
           busmini.cetak();
           System.out.println("penambahan penumpang");
           busmini.addpenumpang(3);
           busmini.cetak();
           busmini.getaverage(40);
           busmini.getaverage(34);
           busmini.getaverage(24);
           System.out.println("=======================");
    }
}

