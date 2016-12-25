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
public abstract class Desain2D {
    int a;
    int b;
    
    public void masukanUkuran(int x, int y){
        a = x;
        b = y;
    }
    
    abstract void gambarDesain();
    abstract void ubahUkuran();   
}
