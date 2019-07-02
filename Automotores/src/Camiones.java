/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Camiones extends BMW{
    
    private int ruedas;
    
    public Camiones(int hpMotor, double precio, int gama, String modelo, int ruedas){
        super(hpMotor, precio, gama, modelo);
        this.ruedas=ruedas;
    }
    
    public void setRuedas (int ruedas){
        this.ruedas=ruedas;
    }
    
    public int getRuedas (){
        return ruedas;
    }    
    
    @Override
    public String toString(){
        return "Modelo: "+this.getModelo()+" de: "+(this.getRuedas()/2)+" cantidad de ejes, con un motor de: "+
                this.getHpMotor()+"cv y su gama es:"+this.getGama()+
                " (de 1 a 5) con un precio estimado de: "+this.getPrecio();
    }
}
