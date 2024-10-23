/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Student
 */
public class Cliente {
    private int id;
    private String nombre;
    private String numContacto;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumContacto(String numContacto) {
        this.numContacto = numContacto;
    }

    public Cliente(int id, String nombre, String numContacto) {
        this.id = id;
        this.nombre = nombre;
        this.numContacto = numContacto;
    }

    public Cliente() {
        this(0,"","");
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", numContacto=" + numContacto + '}';
    }
    
    
    
}
