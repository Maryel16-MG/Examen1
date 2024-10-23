/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */

public class ServicioMantenimiento{
    private String tipoServicio; 
    private String estadoServicio; 

    public ServicioMantenimiento(String tipoServicio, String estadoServicio) {
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

    @Override
    public String toString() {
        return "ServicioMantenimiento{" + "tipoServicio=" + tipoServicio + ", estadoServicio=" + estadoServicio + '}';
    }
    
    public void CambiarEstado (ServicioMantenimiento servicio){
    servicio.CambiarEstado(new completado);
    
    

        
    }
}
