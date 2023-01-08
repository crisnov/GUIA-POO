/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia.entidades;

/**
 *
 * @author crist
 */
public class Circunferencia {

    private double r;

    public Circunferencia(double r) {
        this.r = r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "r=" + r + '}';
    }

}
