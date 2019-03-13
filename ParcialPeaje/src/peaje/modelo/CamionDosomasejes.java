/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.modelo;

/**
 *
 * @author s204e12
 */
public class CamionDosomasejes extends Vehiculo{
    private int valorPeaje;

    public CamionDosomasejes(int valorPeaje, String placa, String marca) {
        super(placa, marca);
        this.valorPeaje = valorPeaje;
    }

    @Override
    public String toString() {
        return "camionDosomasejes{" + "valorPeaje:{" + valorPeaje + "}, placa:{" + placa + "}, marca:{"+ marca +"}"+'}';
    }
    
    

    
}
