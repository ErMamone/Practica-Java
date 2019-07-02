/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private String marca;
    
    public Producto(String nombre, double precio, String marca){
        this.nombre=nombre;
        this.precio=precio;
        this.marca=marca;
    }
    
    void setNombre(String nombre){
        this.nombre=nombre;
    }
    void setPrecio(double precio){
        this.precio=precio;
    }
    void setMarca(String marca){
        this.marca=marca;
    }
    
    String getNombre(){
        return nombre;
    }
    double getPrecio(){
        return precio;
    }
    String getMarca(){
        return marca;
    }
}
