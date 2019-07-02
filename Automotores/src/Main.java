
import java.util.ArrayList;
import java.util.Collections;
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
        
        int r=0, w=0, opcion=0;
        List<BMW> listaDeAutos= new ArrayList();
        List<BMW> listaDeMotos= new ArrayList();
        List<BMW> listaDeCamionetas= new ArrayList();
        List<BMW> listaDeCamiones= new ArrayList();
        
        //HARCODEEEEEEEEEEEEEOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO 
        listaDeAutos.add(new Autos(507,100000,4,5,"M5 E60",500));
        listaDeAutos.add(new Autos(313,180000,5,3,"M6 Coupe",460));
        listaDeAutos.add(new Autos(343,65000,3,5,"M3 Coupe",410));
        listaDeMotos.add(new Motos(34,4345,2,"G 310 R",313));
        listaDeMotos.add(new Motos(215,90244,5,"HP4 RACE",999));
        listaDeCamionetas.add(new Camionetas(218,14000,2,"X3 25i",4));
        listaDeCamionetas.add(new Camionetas(258,66000,4,"330i",2));
        listaDeCamionetas.add(new Camionetas(306,80000,5,"X4 35i X Drive",4));
        listaDeCamiones.add(new Camiones(186,20000,1,"Teberg YT202-EV",10));

        
            System.out.println("Ingrese una opcion.");
        do{
            System.out.println("1)Autos");
            System.out.println("2)Motos");
            System.out.println("3)Camionetas");
            System.out.println("4)Camiones");
            System.out.println("5)Mostrar todo");
            System.out.println("9)Para terminar");
            Scanner teclado = new Scanner(System.in);
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("1)Alta de autos");
                    System.out.println("2)Modificacion de autos");
                    System.out.println("3)Baja de autos");
                    System.out.println("4)Informe de autos");
                    Scanner parte = new Scanner(System.in);
                    r=Integer.parseInt(parte.nextLine());
                    switch(r){
                        case 1:
                            altaAuto(listaDeAutos);
                        break;
                        case 2:
                            modificacionAuto(listaDeAutos);
                        break;
                        case 3:
                            bajaAuto(listaDeAutos);
                        break;
                        case 4:
                            informesAuto(listaDeAutos);
                        break;
                        default:
                        break;
                    }
                    limpiar();
                    break;
                case 2:
                    System.out.println("1)Alta de Motos");
                    System.out.println("2)Modificacion de Motos");
                    System.out.println("3)Baja de Motos");
                    System.out.println("4)Informe de Motos");
                    Scanner parte1 = new Scanner(System.in);
                    r=Integer.parseInt(parte1.nextLine());
                    switch(r){
                        case 1:
                            altaMotos(listaDeMotos);
                        break;
                        case 2:
                            modificacionMotos(listaDeMotos);
                        break;
                        case 3:
                            bajaMotos(listaDeMotos);
                        break;
                        case 4:
                            informesMotos(listaDeMotos);
                        break;
                        default:
                        break;
                    }
                    limpiar();
                    break;
                case 3:
                    System.out.println("1)Alta de Camionetas");
                    System.out.println("2)Modificacion de Camionetas");
                    System.out.println("3)Baja de Camionetas");
                    System.out.println("4)Informe de Camionetas");
                    Scanner parte2 = new Scanner(System.in);
                    r=Integer.parseInt(parte2.nextLine());
                    switch(r){
                        case 1:
                            altaCamionetas(listaDeCamionetas);
                        break;
                        case 2:
                            modificacionCamionetas(listaDeCamionetas);
                        break;
                        case 3:
                            bajaCamionetas(listaDeCamionetas);
                        break;
                        case 4:
                            informesCamionetas(listaDeCamionetas);
                        break;
                        default:
                        break;
                    }
                    limpiar();
                    break;
                case 4:
                    System.out.println("1)Alta de Camiones");
                    System.out.println("2)Modificacion de Camiones");
                    System.out.println("3)Baja de Camiones");
                    System.out.println("4)Informe de Camiones");
                    Scanner parte3 = new Scanner(System.in);
                    r=Integer.parseInt(parte3.nextLine());
                    switch(r){
                        case 1:
                            altaCamiones(listaDeCamiones);
                        break;
                        case 2:
                            modificacionCamiones(listaDeCamiones);
                        break;
                        case 3:
                            bajaCamiones(listaDeCamiones);
                        break;
                        case 4:
                            informesCamiones(listaDeCamiones);
                        break;
                        default:
                        break;
                    }
                    limpiar();
                    break;
                case 5:
                    informesAuto(listaDeAutos);
                    informesMotos(listaDeMotos);
                    informesCamionetas(listaDeCamionetas);
                    informesCamiones(listaDeCamiones);
                    break;
                case 9:
                    r=1;
                    break;
                default:
                    limpiar();
                    System.out.println("Porfavor.\nIngrese una opcion correcta");
                    break;
            }
        }while(r==0);
        System.out.println("Programa terminado");
        
    }

    
    static void limpiar(){
        System.out.println("\n\n\n\n");
    }
    
    private static void altaAuto(List<BMW> lista) {
        
        int motor, gama, puertas, capacidad;
        String modelo;
        double precio;
        
        //Parseo de Scanner a int (nada nuevo)
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        //Parseo forzado con la clase Double y la funcion .parseDouble de Scanner(String) a Double
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese las puertas (3 o 5):");
        Scanner auxpuertas = new Scanner(System.in);
        puertas=auxpuertas.nextInt();
        
        System.out.println("Ingrese el modelo:");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la capacidad de baul (cm3)");
        Scanner auxcapacidad = new Scanner(System.in);
        capacidad=auxcapacidad.nextInt();
        
        lista.add(new Autos(motor,precio,gama,puertas,modelo,capacidad));
    }
    private static void modificacionAuto(List<BMW> lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i+1));
        }
        System.out.println("Que auto desea modificar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
        lista.remove(pos.nextInt()+1);
        
        System.out.println("Procesando... Se ingresara el auto desde 0.");
        
        int motor, gama, puertas, capacidad;
        String modelo;
        double precio;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese las puertas (3 o 5):");
        Scanner auxpuertas = new Scanner(System.in);
        puertas=auxpuertas.nextInt();
        
        System.out.println("Ingrese el modelo:");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la capacidad de baul (cm3)");
        Scanner auxcapacidad = new Scanner(System.in);
        capacidad=auxcapacidad.nextInt();
        
        Autos a1= new Autos(motor,precio,gama,puertas,modelo,capacidad);
        lista.set(pos.nextInt(), a1);
        }else{
            System.out.println("Se cancelo la modificacion");
        }
        
    }
    private static void bajaAuto(List<BMW> lista) {
        System.out.println("Que auto desea eliminar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            lista.remove(pos.nextInt()+1);
        }else{
            System.out.println("No se elimino ningun auto");
        }
    }
    private static void informesAuto(List<BMW> lista) {
        System.out.println("\n---Autos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
    
    
    private static void altaMotos(List<BMW> lista) {
        int motor,gama;
        String modelo;
        double precio;
        int cm3;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese las cc (cm3):");
        Scanner auxcm3 = new Scanner(System.in);
        cm3=auxcm3.nextInt();
        
        lista.add(new Motos(motor,precio,gama,modelo,cm3));
    }
    private static void modificacionMotos(List<BMW> lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i+1));
        }
        System.out.println("Que Moto desea modificar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            
        lista.remove(pos.nextInt()+1);
        System.out.println("Procesando... Se ingresara la moto desde 0.");
        int motor,gama;
        String modelo;
        double precio;
        int cm3;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese las cc (cm3):");
        Scanner auxcm3 = new Scanner(System.in);
        cm3=auxcm3.nextInt();
        
        Motos a1= new Motos(motor,precio,gama,modelo,cm3);
        lista.set(pos.nextInt(), a1);
        }else{
            System.out.println("Se cancelo la modificacion");
        }
    }
    private static void bajaMotos(List<BMW> lista) {
        System.out.println("Que Moto desea eliminar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            lista.remove(pos.nextInt()+1);
        }else{
            System.out.println("No se elimino ninguna moto");
        }
    }
    private static void informesMotos(List<BMW> lista) {
        System.out.println("\n---Motos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    
    private static void altaCamionetas(List<BMW> lista) {
        int motor,gama;
        String modelo;
        double precio;
        int traccion;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la traccion (2 o 4 ruedas):");
        Scanner auxtraccion = new Scanner(System.in);
        traccion=auxtraccion.nextInt();
        
        lista.add(new Camionetas(motor,precio,gama,modelo,traccion));
    }
    private static void modificacionCamionetas(List<BMW> lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i+1));
        }
        System.out.println("Que camioneta desea modificar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            
        lista.remove(pos.nextInt()+1);
        System.out.println("Procesando... Se ingresara la camioneta desde 0.");
        
        int motor,gama;
        String modelo;
        double precio;
        int traccion;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la traccion (2 o 4 ruedas):");
        Scanner auxcm3 = new Scanner(System.in);
        traccion=auxcm3.nextInt();
        
        Camionetas a1= new Camionetas(motor,precio,gama,modelo,traccion);
        lista.set(pos.nextInt(), a1);
        }else{
            System.out.println("Se cancelo la modificacion");
        }
    }
    private static void bajaCamionetas(List<BMW> lista) {
        System.out.println("Que camioneta desea eliminar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            lista.remove(pos.nextInt()+1);
        }else{
            System.out.println("No se elimino ninguna camioneta");
        }
    }
    private static void informesCamionetas(List<BMW> lista) {
        System.out.println("\n---Camionetas:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }    
    }

    
    private static void altaCamiones(List<BMW> lista) {
        int motor,gama;
        String modelo;
        double precio;
        int traccion;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la cantidad de ruedas extras (2, 4, 6):");
        Scanner auxtraccion = new Scanner(System.in);
        traccion=auxtraccion.nextInt();
        
        lista.add(new Camiones(motor,precio,gama,modelo,traccion));
    }
    private static void modificacionCamiones(List<BMW> lista) {
        int i;
        for (i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i+1));
        }
        System.out.println("Que camioneta desea modificar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            
        lista.remove(pos.nextInt()+1);
        System.out.println("Procesando... Se ingresara la camioneta desde 0.");
        
        int motor,gama;
        String modelo;
        double precio;
        int traccion;
        
        System.out.println("Ingrese el Motor:");
        Scanner auxmotor = new Scanner(System.in);
        motor=auxmotor.nextInt();
        
        System.out.println("Ingrese el precio:");
        Scanner auxprecio = new Scanner(System.in);
        precio=Double.parseDouble(auxprecio.nextLine());
        
        System.out.println("Ingrese la gama (1 a 5):");
        Scanner auxgama = new Scanner(System.in);
        gama=auxgama.nextInt();
        
        System.out.println("Ingrese el modelo (exacto):");
        Scanner auxmodelo = new Scanner(System.in);
        modelo=auxmodelo.nextLine();
        
        System.out.println("Ingrese la traccion (2 o 4 ruedas):");
        Scanner auxtraccion = new Scanner(System.in);
        traccion=auxtraccion.nextInt();
        
        Camiones a1= new Camiones(motor,precio,gama,modelo,traccion);
        lista.set(pos.nextInt(), a1);
        }else{
            System.out.println("Se cancelo la modificacion");
        }
    }
    private static void bajaCamiones(List<BMW> lista) {
        System.out.println("Que camioneta desea eliminar? (Ingrese el numero de posicion o 0 para cancelar)");
        Scanner pos=new Scanner(System.in);
        if(pos.nextInt()>0){
            lista.remove(pos.nextInt()+1);
        }else{
            System.out.println("No se elimino ninguna camioneta");
        }    }
    private static void informesCamiones(List<BMW> lista) {
        System.out.println("\n---Camiones:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
