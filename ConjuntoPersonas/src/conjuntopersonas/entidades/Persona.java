/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntopersonas.entidades;

import java.util.Date;

/**
 *
 * @author crist
 */
public class Persona {
    private String nombre;
    private Date fechanNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechanNac) {
        this.nombre = nombre;
        this.fechanNac = fechanNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanNac() {
        return fechanNac;
    }

    public void setFechanNac(Date fechanNac) {
        this.fechanNac = fechanNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechanNac=" + fechanNac.toString() + '}';
    }
    
    
    
}
