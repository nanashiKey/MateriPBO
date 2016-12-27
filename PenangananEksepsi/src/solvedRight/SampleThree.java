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
public class SampleThree {
    
//    static ArithmeticException anyar = new 
//        ArithmeticException("dibawah umur");
    
    public static void main(String [] args){
    
    try{
    validate(2);  
      //System.out.println(anyar);
    }catch (ArithmeticException z){
            System.out.println(z.getMessage());
        }
    }   
static void validate(int age){  
     if(age<18){  
      throw new ArithmeticException("dibawah umur");
     }else{  
      System.out.println("welcome to vote");  
        }      
    }
}
