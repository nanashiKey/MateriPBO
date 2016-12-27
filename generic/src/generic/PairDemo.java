/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Irfan Assidiq
 * @source BigJava 4th Edition
 */
public class PairDemo {
public static void main(String[] args){
    
    String[] names = { "Tom", "Diana", "Harry" };
    Pair<String, Integer> result = firstContaining(names, "o");
    System.out.println(result.getFirst());
    System.out.println("Expected: Diana");
    System.out.println(result.getSecond());
    System.out.println("Expected: 1");
    
}
/**
 * Gets the ﬁrst String containing a given string, together
 * with its index.
 * @param strings an array of strings 
 * @param sub a string
 * @return a pair (strings[i], i) where strings[i] is the ﬁrst
 * strings[i] containing str, or a pair (null, -1) if there is no match. */
public static Pair<String, Integer> firstContaining(String[] strings,
        String sub){
    for (int i = 0; i < strings.length; i++){
        if (strings[i].contains(sub)){
            return new Pair<String, Integer>(strings[i], i);
        } 
    }
    return new Pair<String, Integer>(null, -1);
} 
}

