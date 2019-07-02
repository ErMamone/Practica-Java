
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meroz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Producto> listaDeProductos= new ArrayList();
        List<Double> listaDePrecios= new ArrayList();
        int repetidor=1,r;
        
        //Hardcodeo de la lista para tener items y hacer la prueba sin problemas
        listaDeProductos.add(new Remera("Rusty","Long Beach",11,"negro",150));
        listaDeProductos.add(new Remera("Adidas","Chomba",11,"Amarillo",230));
        listaDeProductos.add(new Zapatillas("DC","Classic",13,47,4000));
        listaDeProductos.add(new Zapatillas("Adidas","Runner",11,44,2100));
        listaDeProductos.add(new Pantalon("Billabong","regular slim",36,"de denim oscuro",1460));
        
        //Hardcodeo para el analisis del precio y su total, se envia el precio del objeto atravez de la lista y el .get()
        listaDePrecios.add(listaDeProductos.get(0).getPrecio());
        listaDePrecios.add(listaDeProductos.get(1).getPrecio());
        listaDePrecios.add(listaDeProductos.get(2).getPrecio());
        listaDePrecios.add(listaDeProductos.get(3).getPrecio());
        listaDePrecios.add(listaDeProductos.get(4).getPrecio());

        //bucle para el add de datos
        do{
            System.out.println("Ingrese su opcion (1 o 2)\n1)Cargar una remera\n2)Terminar y mostrar productos");
            Scanner teclado=new Scanner(System.in);
            r=Integer.parseInt(teclado.nextLine());
        switch(r){
            case 1: 
                //Metodo para agregar datos, como parametros las dos listas
                cargaProducto(listaDeProductos,listaDePrecios);
                break;
            case 2:
                repetidor=0;
                break;
            case 0:
            default:
                break;
        }
        }while(repetidor==1);
        
        double suma=0;
        for (int i = 0; i < listaDeProductos.size(); i++) {
            System.out.println(listaDeProductos.get(i));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            suma+=listaDePrecios.get(i);
        }
        System.out.println(suma+" es el total gastado");
    }

    static void cargaProducto(List<Producto> lista, List<Double> precios) {
        
        //Auxiliares para los nuevos productos(solo remera, sino habria mucha validacion, switchs y funciones)
        String marca,modelo,color;
        int talle;
        double precio;
        
        System.out.println("Ingrese la marca: ");
        Scanner aux= new Scanner(System.in);
        marca=aux.nextLine();
        
        System.out.println("Ingrese el modelo: ");
        Scanner auxModel= new Scanner(System.in);
        modelo=auxModel.nextLine();
        
        System.out.println("Ingrese el color: ");
        Scanner auxColor= new Scanner(System.in);
        color=auxColor.nextLine();
        
        System.out.println("Ingrese el talle: ");
        Scanner auxTalle= new Scanner(System.in);
        talle=auxTalle.nextInt();
        
        System.out.println("Ingrese el precio: ");
        Scanner auxPrecio= new Scanner(System.in);
        precio=Double.parseDouble(auxPrecio.nextLine());
        
        //.add a la lista que se pasa en la funcion, hubiese preferido una funcion para esto.
        lista.add(new Remera(marca,modelo,talle,color,precio));
        precios.add(lista.get(0).getPrecio());
                
    }
    
}
