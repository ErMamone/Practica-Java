/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Zapatillas extends Producto{
    
    private int talleEU;
    private int talleUSA;

    public Zapatillas(String marca, String nombre,  int talleUSA, int talleEU, double precio){ 
        super(nombre, precio, marca);
        this.talleEU=talleEU;
        this.talleUSA=talleUSA;
    }
    
    void setTalleEU(int talleEU){
        this.talleEU=talleEU;
    }
    void setTalleUSA(int talleUSA){
        this.talleUSA=talleUSA;
    }
    
    int getTalleEU(){
        return talleEU;
    }
    int getTalleUSA(){
        return talleUSA;
    }
    
    @Override
    public String toString(){
        return "Zapatilla "+this.getMarca()+" '"+this.getNombre()+"', talle EU: "+this.getTalleEU()+"/ talle USA: "+this.getTalleUSA()+", a $"+this.getPrecio();
    }
}
