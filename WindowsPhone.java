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
public class WindowsPhone extends Handphone {
        private String wpKeyStore;
        public WindowsPhone (String man,String os,String model,int harga, String wpKeyStore){
        super(man,os,model,harga);
        this.wpKeyStore = wpKeyStore;
    } 
        
    
   public String getWpKeyStore(){
          return wpKeyStore;
    }
   public void setPinBB(){
       this.wpKeyStore = wpKeyStore;
   }
   
  //methode
}
