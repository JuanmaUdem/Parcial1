/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.controlador;

import java.security.Principal;
import java.util.ArrayList;
import peaje.modelo.Vehiculo;
import peaje.vista.principal;

/**
 *
 * @author s204e12
 */
public class Controler {
    static ArrayList vehiculos = new ArrayList();
    principal auxiliar=new principal();
    
    public void guardarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public static void mostrarVehiculo(){
        for (Object object : vehiculos) {
            System.out.println(((Vehiculo)object).toString());
            System.out.println("El vehiculo es: "+((Vehiculo)object).toString());
            System.out.println(" ");
        }
    }
}

    

