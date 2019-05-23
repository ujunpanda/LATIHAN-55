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
public class Latihan55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //methode
        Android hp = new Android("samsung","android","grand",30000000,"234ibfd3840fo");
        System.out.println("Manufacture : "+hp.getman());
        System.out.println("Operating System : "+hp.getos());
        System.out.println("Model : "+hp.getmodel());
        System.out.println("Harga : "+hp.getharga());
        System.out.println("Android key Store : "+hp.getKeyStore());
        System.out.println("---------------------------------------------------------------------------------");
      
        BlackBerry bb = new BlackBerry("BlackBerry","RIM","curve",2000000,"BHS 249");
        System.out.println("Manufacture : "+bb.getman());
        System.out.println("Operating System : "+bb.getos());
        System.out.println("Model : "+bb.getmodel());
        System.out.println("Harga : "+bb.getharga());
        System.out.println("Android key Store : "+bb.getPinBB());
        System.out.println("---------------------------------------------------------------------------------");
      
        WindowsPhone windows = new WindowsPhone("Nokia","win8","lumia",1000000,"UUUQIJWORJ");
        System.out.println("Manufacture : "+windows.getman());
        System.out.println("Operating System : "+windows.getos());
        System.out.println("Model : "+windows.getmodel());
        System.out.println("Harga : "+windows.getharga());
        System.out.println("Android key Store : "+windows.getWpKeyStore());
        System.out.println("---------------------------------------------------------------------------------");

  
      
   
        
    }
   
}
