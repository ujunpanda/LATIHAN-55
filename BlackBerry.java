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
public class BlackBerry extends Handphone {
    private String pinBB;
    public BlackBerry (String man,String os,String model,int harga, String pinBB){
        super(man,os,model,harga);
        this.pinBB = pinBB;
    } 
   public String getPinBB(){
          return pinBB;
    }
   public void setPinBB(){
       this.pinBB = pinBB;
   }
  //methode
}