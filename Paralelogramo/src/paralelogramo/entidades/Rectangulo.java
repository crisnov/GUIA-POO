/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelogramo.entidades;

/**
 *
 * @author crist
 */
public class Rectangulo {

    private double b;
    private double h;

    public Rectangulo() {
    }

    public Rectangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "b=" + b + ", h=" + h + '}';
    }

}
