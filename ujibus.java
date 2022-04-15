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
public class ujibus {
    public static void main(String[] args) {
         bus busMini=new bus(10);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        busMini.cetak();

        
         
    }
}
