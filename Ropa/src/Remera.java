/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Remera extends Producto {
    
    private int talle;
    private String color;
    
    public Remera(String marca,String nombre, int talle, String color ,double precio){
        super(nombre, precio, marca);
        this.talle=talle;
        this.color=color;
    }
    
    void setTalle(int talle){
        this.talle=talle;
    }
    void setColor(String color){
        this.color=color;
    }
    
    int getTalle(){
        return talle;
    }
    String getColor(){
        return color;
    }
    
    @Override
    public String toString(){
        return "Remera "+this.getMarca()+" '"+this.getNombre()+"', talle: "+this.getTalle()+" color: "+this.getColor()+", a $"+this.getPrecio();
    }
}
