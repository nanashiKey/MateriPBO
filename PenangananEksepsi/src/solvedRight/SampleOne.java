/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solvedRight;

/**
 *
 * @author Irfan Assidiq
 */
public class SampleOne {

public static void main(String [] ar){    

    try{  
    int a = 5;  
    int b = a/0;  
    }catch(ArithmeticException e){
        System.out.println(e);
        }
    System.out.println("Setelah eksepsi");
    }
}
