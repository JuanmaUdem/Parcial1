/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.vista;

import peaje.controlador.Controler;

/**
 *
 * @author s204e12
 */
public class Main {
    private static Controler auxiliar;

    
    public static void  main(String[] args){
       principal p = new principal();
       p.llenarAutomovil();
       p.llenarcamionUneje();
       p.llenarcamionDosomasejes();
       p.llenarmoto();
       
       auxiliar.mostrarVehiculo();
        
        
    }

    }
    

