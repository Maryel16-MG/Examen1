/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;


/**
 *
 * @author fabia
 */
public class Mantenimiento{
    private String tipoServicio; 
    private String estadoServicio; 

    public Mantenimiento(String tipoServicio, String estadoServicio) {
        this.tipoServicio = tipoServicio;
        this.estadoServicio = estadoServicio;
    }

    public String getTipoServicio() {  
        return tipoServicio;  
    }  

    public void setTipoServicio(String tipoServicio) {  
        this.tipoServicio = tipoServicio;  
    }  

    public String getEstadoServicio() {  
        return estadoServicio;  
    }  

    public void setEstadoServicio(String estadoServicio) {  
        this.estadoServicio = estadoServicio;  
    }  

    public String mostrarDetalles() {  
        return "Tipo de Servicio: " + tipoServicio + ", Estado del Servicio: " + estadoServicio;  
    }  

    public void cambiarEstado(String nuevoEstado) {  
        this.estadoServicio = nuevoEstado;  
    }  
}

