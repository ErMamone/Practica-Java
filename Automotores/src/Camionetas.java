/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Camionetas extends BMW{
    
    private int traccion;
    
    public Camionetas(int hpMotor, double precio, int gama, String modelo, int traccion){
        super(hpMotor, precio, gama, modelo);
        this.traccion=traccion;
    }
    
    public void setTraccion (int traccion){
        this.traccion=traccion;
    }
    
    public int getTraccion (){
        return traccion;
    }    
    
    @Override
    public String toString(){
        return "Modelo: "+this.getModelo()+" con traccion de "+this.getTraccion()+" ruedas, con un motor de: "+
                this.getHpMotor()+"cv y su gama es:"+this.getGama()+
                " (de 1 a 5) con un precio estimado de: "+this.getPrecio();}
}
