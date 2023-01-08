/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoverificador.entidades;

/**
 *
 * @author crist
 */
public class NIF {
    private long DNI;
    private String car;

    public NIF() {
    }

    public NIF(long DNI, String car) {
        this.DNI = DNI;
        this.car = car;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "NIF{" + "DNI=" + DNI + ", car=" + car + '}';
    }
    
    
}
