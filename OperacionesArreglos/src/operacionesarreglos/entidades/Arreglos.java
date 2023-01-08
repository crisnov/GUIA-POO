/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesarreglos.entidades;

import java.util.Arrays;

/**
 *
 * @author crist
 */
public class Arreglos {
    private double[] VectorA;
    //private double[] VectorB;

    public Arreglos() {
    }

    public Arreglos(double[] VectorA) {
        this.VectorA = VectorA;
    }

    public double[] getVectorA() {
        return VectorA;
    }

    public void setVectorA(double[] VectorA) {
        this.VectorA = VectorA;
    }

    @Override
    public String toString() {
        return "Arreglos{" + "VectorA=" + Arrays.toString(VectorA) + '}';
    }


    

   
    
    
    
}
