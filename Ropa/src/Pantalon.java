/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Pantalon extends Producto {
    
    private int talle;
    private String material;
    
    public Pantalon(String marca, String nombre, int talle, String material, double precio){
        super(nombre, precio, marca);
        this.talle=talle;
        this.material=material;
    }
    
    void setTalle(int talle){
        this.talle=talle;
    }
    void setMaterial(String material){
        this.material=material;
    }
    
    int getTalle(){
        return talle;
    }
    String getMaterial(){
        return material;
    }
    
    @Override
    public String toString(){
        return "Pantalon "+this.getMarca()+" '"+this.getNombre()+"', talle : "+this.getTalle()+" material: "+this.getMaterial()+", a $"+this.getPrecio();
    }
}
