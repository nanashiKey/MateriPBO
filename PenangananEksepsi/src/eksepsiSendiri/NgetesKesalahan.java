/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksepsiSendiri;

/**
 *
 * @author Irfan Assidiq
 */
public class NgetesKesalahan {
    
    static KesalahanSendiri ajah = new KesalahanSendiri("ciee salah");
    public static void main(String [] args) throws KesalahanSendiri{ // throws disini berfungsi hanya saat didalam code main memiliki throw saja tanpa try catch
        
        int a = 0;
        try{
        if(a ==0){
            throw ajah;
            }
        }catch(KesalahanSendiri e){
            System.out.println(e.getMessage());
        }        
    }   
}
