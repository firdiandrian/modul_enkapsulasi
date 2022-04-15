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
public class praktikum_testbola {
     public static void main(String[] args) {
        double jarijari=7;
        praktikum_bola bola = new praktikum_bola(4);
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
        System.out.println("\n\n");
        
        bola.setJarijari(jarijari); //manipulasi
        bola.showDiameter();
        bola.showLuasPermukaan();
        bola.showVolume();
    }
}
