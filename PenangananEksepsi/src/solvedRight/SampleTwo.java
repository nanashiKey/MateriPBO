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
public class SampleTwo {

   public static void main (String [] arg){
   try{  
   int data=25/0;  
   System.out.println(data);  
    }catch(ArithmeticException e){
      System.out.println("angka gabisa dibagi dengan 0");
    }  
   finally{
      int z = 25/1;
      System.out.println(z);
      }  
  }
}
