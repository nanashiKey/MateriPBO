/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 * @author Irfan Assidiq
 * @source http://pintar-java.blogspot.co.id/2008/03/generic-di-java-apa-itu.html
 */

import java.util.*;
public class prak_ArrayList {
public static void main(String[] args) {
    
  List<Integer> arrList = new ArrayList<Integer>();  
  for (int i = 0; i < 10; i++) {  
   arrList.add(i);  
  }  
  
  Iterator<Integer> i = arrList.iterator();  
  
  System.out.println("Deretan Angka Genap");  
  System.out.println("===================");  
  while (i.hasNext()) {  
   int a;  
   a = i.next() * 2;  
   System.out.print("Hasil = " + a + "\n");  
  }  
 }
}