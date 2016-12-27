/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Irfan Assidiq
 * @source http://pintar-java.blogspot.co.id/2008/03/generic-di-java-apa-itu.html
 */

import java.util.ArrayList;  
import java.util.List;  

public class prak_ArrayL {
  public static void main(String[] args) {  
  List arrList = new ArrayList();  
  
  arrList.add(10);  
  arrList.add(new Integer(100));  
  arrList.add("Hello World !");  
    
  int a = ((Integer) arrList.get(0)).intValue();    //casting ke int  
  Integer b = (Integer) arrList.get(1);             //casting kembali ke objek bertipe Integer  
  String c = (String) arrList.get(2);               //casting kembali ke objek bertipe String  
  
  System.out.println(a);  
  System.out.println(b);  
  System.out.println(c);  
 }  
}      