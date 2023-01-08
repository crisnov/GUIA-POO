/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesarreglos;

import java.util.Arrays;
import java.util.Scanner;
import operacionesarreglos.entidades.Arreglos;
import operacionesarreglos.servicios.ServicioArreglos;

/**
 *
 * @author crist
 */
public class OperacionesArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.*/
        Scanner leer = new Scanner(System.in);
        ServicioArreglos sa = new ServicioArreglos();

        System.out.println("Ingrese tamaño del Vector A:");
        int n = leer.nextInt();
        System.out.println("Tamaño para el vector:" + n);
        double[] VectorA = new double[n];

        System.out.println(" ");
        for (int i = 0; i < VectorA.length; i++) {
            VectorA[i] = (double) (Math.random() * 49.0 + 0);
            System.out.println("v[" + i + "]= " + VectorA[i]);
        }
        System.out.println(" ");

        Arrays.sort(VectorA);
        System.out.println(Arrays.toString(VectorA));
        
        double[] VectorB = Arrays.copyOf(VectorA, 20);
        Arrays.fill(VectorB, 10, 20, 0.5);       
        
        System.out.println(Arrays.toString(VectorB));

       
        
        
        
        /*System.out.println(" ");
        for (int i = 0; i < VectorB.length; i++) {
            VectorB[i] = 0.5;
            System.out.println("v[" + i + "]= " + VectorB[i]);
        }
        System.out.println(" ");*/

    }

}
