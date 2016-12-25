/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrak1;

/**
 *
 * @author Irfan Assidiq
 */
public class Mainnya {
    public static void main(String [] args){
        Persegi samaKaki = new Persegi();
      
        samaKaki.masukanUkuran(15, 15);
        System.out.println("ukuran sisinya adalah "+ samaKaki.a +
                " ukuran sisinya adalah "+ samaKaki.b);
        
        samaKaki.ubahUkuran(10, 25);
        System.out.println("ukuran sisinya setelah diubah adalah "+ samaKaki.a +
                " ukuran sisinya adalah "+ samaKaki.b);
    }
    
}
