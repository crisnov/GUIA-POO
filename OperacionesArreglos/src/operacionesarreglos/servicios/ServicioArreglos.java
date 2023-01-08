/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesarreglos.servicios;

import java.util.Arrays;
import java.util.Scanner;
import operacionesarreglos.entidades.Arreglos;

/**
 *
 * @author crist
 */
public class ServicioArreglos {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Arreglos crearArreglo() {
        System.out.println("Ingrese tamaño del vector:");
        int n = leer.nextInt();
        System.out.println("Tamaño para el vector:" + n);
        double[] VectorA = new double[n];

        System.out.println(" ");
        for (int i = 0; i < VectorA.length; i++) {
            VectorA[i] = (int) (Math.random() * 50 + 1);
            System.out.println("v[" + i + "]= " + VectorA[i]);
        }
        System.out.println(" ");

        /*System.out.println("Tamaño para el vector B: 20 ");
        int m = 20;
        double[] VectorB = new double[m];

        System.out.println(" ");
        for (int i = 0; i < VectorB.length; i++) {
            VectorB[i] = (int) (Math.random() * 50 + 1);
            System.out.println("v[" + i + "]= " + VectorB[i]);
        }
        System.out.println(" ");*/
        return new Arreglos(VectorA);
    }

    public Arreglos ordenarArreglo(Arreglos VectorA) {

        Arrays.sort(VectorA.getVectorA());
        
        return VectorA;

    }

    public Arreglos copiarArreglo(Arreglos VectorA) {
        VectorA.getVectorA();
        int m = 20;
        double[] VectorB = new double[m];

        System.out.println(" ");
        for (int i = 0; i < VectorB.length; i++) {
            VectorB[i] = 0.5;
            System.out.println("v[" + i + "]= " + VectorB[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            //VectorB[i] = VectorA.getVectorA();
            System.out.println("v[" + i + "]= " + VectorB[i]);
        }

        return VectorA;
    }

}
