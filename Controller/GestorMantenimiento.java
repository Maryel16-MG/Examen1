/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Student
 */
public class GestorMantenimiento extends Vehiculo {
private static GestorMantenimiento instancia;  
    private List<Vehiculo> vehiculos;  

    private GestorMantenimiento() {  
        vehiculos = new ArrayList<>();  
    }  

    public static synchronized GestorMantenimiento getInstancia() {  
        if (instancia == null) {  
            instancia = new GestorMantenimiento();  
        }  
        return instancia;  
    }  

    public void agregarVehiculo(Vehiculo vehiculo) {  
        vehiculos.add(vehiculo);  
    }  

    public List<Vehiculo> getVehiculos() {  
        return vehiculos;  
    }  

    public int contarVehiculosEnMantenimiento() {  
        return (int) vehiculos.stream().filter(v ->true).count();  
    }  

    public int contarServiciosCompletados() {  
        return (int) vehiculos.stream().filter(v -> true).count();  
    }  
}
