/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Autos extends BMW {
    
    private int capacidadBaul;
    private int puertas;
            
    public Autos (int hpMotor, double precio, int gama, int puertas, String modelo, int capacidadBaul){
        super(hpMotor, precio, gama, modelo);
        this.capacidadBaul=capacidadBaul;
        this.puertas=puertas;
    }
    
    public void setCapacidadBaul (int capacidadBaul){
        this.capacidadBaul= capacidadBaul;
    }
    public void setPuertas (int puertas){
        this.puertas=puertas;
    }
    
    public int getPuertas (){
        return puertas;
    }
    public int getCapacidadBaul (){
        return capacidadBaul;
    }    
    
    @Override
    public String toString(){
        return "Modelo: "+this.getModelo()+" de: "+this.getPuertas()+" puertas, con un motor de: "+
                this.getHpMotor()+"cv, con capacidad de:"+this.getCapacidadBaul()+"cm3 de baul, y su gama es:"+
                this.getGama()+" (de 1 a 5) con un precio estimado de: "+this.getPrecio();
    }
}
