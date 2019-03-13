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
public abstract class Vehiculo { //clase abstracta ya que todos son vehiculos
    protected String placa;
    protected String marca;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "placa=" + placa + ", marca=" + marca + '}';
    }
    
}
