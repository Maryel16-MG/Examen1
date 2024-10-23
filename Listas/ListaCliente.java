/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ListaCliente {
        public static void main(String[] args) {  
        ArrayList<Cliente> listaCliente = new ArrayList<>();  
  
        listaCliente.add(new Cliente(1231545,"Tatiana",  "88965241"));  
        listaCliente.add(new Cliente(78646798, "Carlos", "9863521"));  
        listaCliente.add(new Cliente(24545444, "Kevin", "78542361"));  

        System.out.println("Lista de Vehículos:");  
        for (Cliente cliente : listaCliente ) {  
            System.out.println(cliente);  
        }  

        System.out.println("Total de vehículos en la lista: " + listaCliente.size());  

        String BuscarCliente = "Tatiana";  
        for (Cliente  cliente : listaCliente ) {  
            if (cliente.getNombre().equals(BuscarCliente)) {  
                System.out.println("cliente encontrado: " + cliente);  
                break;  
            }  
        }  

        listaCliente .removeIf(v -> v.getNombre().equals("ABC123"));  
        System.out.println("Lista de clientes después de eliminar uno:");  
        for (Cliente cliente : listaCliente ) {  
            System.out.println(cliente);  
        }  
    }  
}


