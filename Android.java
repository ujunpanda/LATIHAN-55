/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan55;

/**
 *
 * @author DADAR GULUNG JUMBO
 */
public class Android extends Handphone {
    private String keyStore;
    public Android (String man,String os,String model,int harga, String keyStore){
        super(man,os,model,harga);
        this.keyStore = keyStore;
    }

    public String getKeyStore(){
        return keyStore;
    }
    
    public void setKeyStore(String keyStore){
        this.keyStore = keyStore;
    }
 
    //methode
   
}
