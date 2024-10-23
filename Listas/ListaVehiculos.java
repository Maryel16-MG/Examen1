/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Modelo.Vehiculo;
import java.util.ArrayList;



/**
 *
 * @author Student
 */
public class ListaVehiculos {
     public static void main(String[] args) {  
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();  
  
        listaVehiculos.add(new Vehiculo("Toyota", "Corolla", "ABC123"));  
        listaVehiculos.add(new Vehiculo("Honda", "Civic", "XYZ789"));  
        listaVehiculos.add(new Vehiculo("Suzuki", "Swift Sport", "LMN456"));  

        System.out.println("Lista de Vehículos:");  
        for (Vehiculo vehiculo : listaVehiculos) {  
            System.out.println(vehiculo);  
        }  

        System.out.println("Total de vehículos en la lista: " + listaVehiculos.size());  

        String matriculaBuscar = "XYZ789";  
        for (Vehiculo vehiculo : listaVehiculos) {  
            if (vehiculo.getMatricula().equals(matriculaBuscar)) {  
                System.out.println("Vehículo encontrado: " + vehiculo);  
                break;  
            }  
        }  

        listaVehiculos.removeIf(v -> v.getMatricula().equals("ABC123"));  
        System.out.println("Lista de Vehículos después de eliminar uno:");  
        for (Vehiculo vehiculo : listaVehiculos) {  
            System.out.println(vehiculo);  
        }  
    }  
}


   
