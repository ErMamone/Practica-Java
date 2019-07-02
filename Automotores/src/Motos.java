/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Motos extends BMW {
    
    private int cm3;
    
    public Motos (int hpMotor, double precio, int gama, String modelo, int cm3){
        super(hpMotor, precio, gama, modelo);
        this.cm3=cm3;
    }
    
    public void setCm3 (int cm3){
        this.cm3=cm3;
    }
    
    public int getCm3 (){
        return cm3;
    }
    
    
    @Override
    public String toString(){
        return "Modelo: "+this.getModelo()+" con "+this.getCm3()+" cc, con un motor de: "+
                this.getHpMotor()+"cv y su gama es:"+this.getGama()+
                " (de 1 a 5) con un precio estimado de: "+this.getPrecio();
    }
}
