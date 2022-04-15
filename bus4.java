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
public class bus4 {
   private int penumpang,maxpenumpang;
   
   // konstruktor
   public bus4(int maxpenumpang){
       this.maxpenumpang=maxpenumpang;
       penumpang = 0 ;
   }
   // method mutator
   public void pluspenumpang(int penumpang){
       int temp;
       temp=this.penumpang+penumpang;
       if (temp>=maxpenumpang) {
           System.out.println("overload penumpang");  
       }
       else {
          this.penumpang=temp; 
       }
   }
   public void getpassword(int password){
       if (password==90) {
           System.out.println("password benar");
       }
       else{
           System.out.println("pass salah");
       }
   }
   public void cetak(){
       System.out.println("penumpang sekarang = "+penumpang);
       System.out.println("penumpang seharusnya adalah = "+maxpenumpang);
   }
}
