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
public class ujibus4 {
    public static void main(String[] args) {
        bus4 busmini4 = new bus4(10);
        busmini4.getpassword(40);
        busmini4.getpassword(90);
        busmini4.cetak();
        
       
        busmini4.pluspenumpang(3);
        busmini4.cetak();
        
        busmini4.pluspenumpang(1);
        busmini4.cetak();
        
        busmini4.pluspenumpang(1);
        busmini4.cetak();
    }
}
