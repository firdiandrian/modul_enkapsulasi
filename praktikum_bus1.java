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
public class praktikum_bus1 {
       private double penumpang,maxpenumpang;
       private double counter,penumpangngbaru,berat;
   
   // konstruktor
   public praktikum_bus1(double maxpenumpang){
       this.maxpenumpang=maxpenumpang;
       penumpang = 0 ;
   }
   // method mutator
   public void addpenumpang(double penumpang){
       double temp;
       temp=this.penumpang+penumpang;
       if (temp>=maxpenumpang) {
           System.out.println("overload penumpang");  
       }
       else {
          this.penumpang=temp;
          counter=counter+1;
       }
   }
   public void getaverage(double berat){
      double average;
      average=this.berat+berat;
      this.berat=average;
       System.out.println("==========");
       System.out.println("berat penumpang: "+average);
       System.out.println("berat rata-rata penumpang: "+average/3);
           
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

