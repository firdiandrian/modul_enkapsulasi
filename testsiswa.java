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
public class testsiswa {
    public static void main(String[] args) {
        encapsiwa siswa = new encapsiwa();
        siswa.setname("agus");
        siswa.setage(20);
        siswa.setaddres("malang");
        
            System.out.println("nama: "+siswa.getname()+" alamat "+siswa.getaddres()+" berumur "+siswa.getage()+" tahun");
    }
}
