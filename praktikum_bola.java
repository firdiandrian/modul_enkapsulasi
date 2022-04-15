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
public class praktikum_bola {
        private double jarijari;
        public praktikum_bola(double jarijari){
        this.jarijari=jarijari;
           
                }
    
    public void setJarijari (double jarijari){
        this.jarijari=jarijari;
        
    }
    
    public void showDiameter(){
        System.out.println("diameter bola       = "+2*jarijari);
    }
    
    public void showLuasPermukaan (){
        System.out.println("luas permukaan bola = "+ (4*Math.PI*Math.pow(jarijari,2)));
    }
    
    public void showVolume(){
        System.out.println("volume bola         = "+ (4/3*Math.PI*Math.pow(jarijari,3)));
    }

}
