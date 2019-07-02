/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public abstract class BMW {
    private int hpMotor;
    private double precio;
    private int gama;
    private String modelo;
    
    public BMW(int hpMotor, double precio, int gama, String modelo){
        this.hpMotor=hpMotor;
        this.precio=precio;
        this.gama=gama;
        this.modelo=modelo;
        
    }
    
    public void setHpMotor(int hpMotor){
        this.hpMotor=hpMotor;
    }
    public void setGama(int gama){
        this.gama=gama;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    public int getHpMotor(){
        return hpMotor;
    }
    public int getGama(){
        return gama;
    }
    public double getPrecio(){
        return precio;
    }
    public String getModelo(){
        return modelo;
    }

}
