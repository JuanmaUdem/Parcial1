/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.vista;

import java.util.ArrayList;
import java.util.Scanner;
import peaje.controlador.Controler;
import peaje.modelo.Automovil;
import peaje.modelo.CamionDosomasejes;
import peaje.modelo.CamionUneje;
import peaje.modelo.Moto;
import peaje.modelo.Vehiculo;

/**
 *
 * @author s204e12
 */
public class principal {
    static Scanner entrada = new Scanner(System.in);
    static Controler controlador = new Controler();
    private Vehiculo vehiculoAuxiliar;
    
   
    public void llenarAutomovil(){
        String placa, marca ;
        
        
        System.out.println("Ingrese la placa para automovil: ");
        placa = entrada.next();
        System.out.println("Ingrese la marca para automovil: ");
        marca = entrada.next();
        System.out.println("valor del peaje para automovil");
        String valor = entrada.next();
        
        Automovil automovil = new Automovil(Integer.valueOf(valor), placa, marca);
        controlador.guardarVehiculo(automovil);
    }
    
    public void llenarcamionDosomasejes(){
        String placa, marca;
    
        System.out.println("Ingrese la placa para camion Dos o mas ejes: ");
        placa = entrada.next();
        System.out.println("Ingrese la marca para camion Dos o mas ejes: ");
        marca = entrada.next();
        System.out.println("valor del peaje para camion Dos o mas ejes");
        String valor = entrada.next();
        
        CamionDosomasejes camiondosomasejes = new CamionDosomasejes(Integer.valueOf(valor),placa, marca);
        controlador.guardarVehiculo(camiondosomasejes);
    
    }
   
    public void llenarcamionUneje(){
        String placa, marca;
    
        System.out.println("Ingrese la placa para camion un eje: ");
        placa = entrada.next();
        System.out.println("Ingrese la marca para camion un eje: ");
        marca = entrada.next();
        System.out.println("valor del peaje para camion un eje");
        String valor = entrada.next();
    
        CamionUneje camionuneje = new CamionUneje(Integer.valueOf(valor),placa, marca);
        controlador.guardarVehiculo(camionuneje);
    }
    
    public void llenarmoto(){
        String placa, marca;
    
        System.out.println("Ingrese la placa para moto: ");
        placa = entrada.next();
        System.out.println("Ingrese la marca para moto: ");
        marca = entrada.next();
        System.out.println("valor del peaje para moto");
        String valor = entrada.next();
    
        Moto moto = new Moto(Integer.valueOf(valor),placa, marca);
        controlador.guardarVehiculo(moto);
    
    
    
    }
    
}
