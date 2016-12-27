/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generic;

/**
 *
 * @author Irfan Assidiq
 * @source BigJava 4th edition
 *
 *This class collects a pair of elements of different types. 3 */ 

public class Pair<T, S> {
    private T first;
    private S second;
    
/** 
 * Constructs a pair containing two given elements.
 * @param firstElement the ﬁrst element      
 * @param secondElement the second element*/
    
    public Pair(T firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
    }
    
    /**
     * Gets the ﬁrst element of this pair.
     * @return the ﬁrst element
     */
    
    public T getFirst() { 
        return first;
    }
    
    /**Gets the second element of this pair.
     * @return the second element
     */
    public S getSecond(){
        return second; 
    }
    public String toString(){
        return "(" + first + ", " + second + ")"; 
    }
}
