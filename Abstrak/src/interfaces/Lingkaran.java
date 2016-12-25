/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Irfan Assidiq
 */
public class Lingkaran implements Desain2D{

    @Override
    public void gambarDesain() {
        System.out.println("ini bentuk lingkaran");
    }

    @Override
    public void ubahUkuran() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
