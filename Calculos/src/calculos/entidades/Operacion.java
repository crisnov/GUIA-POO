/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos.entidades;

/**
 *
 * @author crist
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }

    

   
    
    

}
