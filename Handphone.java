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
//class
public class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

//object
public Handphone (String man, String os, String model, int harga){
       this.manufacture = man;
       this.operatingSystem = os;
       this.model = model;
       this.harga = harga;
   }
//manufacture
public String getman(){
    return manufacture;
}

public void setman(String man){
    this.manufacture = man;
}

//operating system
public String getos(){
    return operatingSystem;
}

public void setos(String os){
    this.operatingSystem = os;
            }
//model 
public String getmodel(){
    return model;
}
public void setmodel(String model){
    this.model = model;
}
public int getharga(){
    return harga;
}

public void setharga(int harga){
    this.harga = harga;
}

//methode
   public void displayProduct(){
        System.out.println("manufacture"+manufacture);
        System.out.println("Sistem Operasi"+operatingSystem);
        System.out.println("Model"+model);
        System.out.println("Harga"+harga);
    }
}
        
