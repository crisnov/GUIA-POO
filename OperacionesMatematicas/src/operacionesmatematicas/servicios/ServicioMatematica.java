/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas.servicios;

import java.util.Scanner;
import operacionesmatematicas.entidades.Matematica;

/**
 *
 * @author crist
 */
public class ServicioMatematica {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearMatematica() {
        System.out.println("se crearan los numeros de forma aleatoria:");
        double n1 = (double) (Math.random() * 9) + 1;
        double n2 = (double) (Math.random() * 9) + 1;

        if (n1 != 0 && n2 != 0) {
            System.out.println("numeros asignados satisfactoriamente");
        }

        return new Matematica(n1, n2);
    }

    public double devolverMayor(Matematica mat1) {
        double a = 0;
        if (mat1.getNum1() > mat1.getNum2()) {
            a = (Math.round((mat1.getNum1()) * 100.0) / 100.0);
            System.out.println("Numero 1 > Numero 2");

        } else {
            a = (Math.round((mat1.getNum2()) * 100.0) / 100.0);
            System.out.println("Numero 2 > Numero 1");
        }

        return a;
    }

    public double calcularPotencia(Matematica mat1) {
        double A = 0;
        if (mat1.getNum1() > mat1.getNum2()) {
            A = (Math.round((Math.pow(mat1.getNum1(), mat1.getNum2())) * 100.0) / 100.0);

        } else {
            A = (Math.round((Math.pow(mat1.getNum2(), mat1.getNum1())) * 100.0) / 100.0);
        }

        return A;
    }

    public double calcularRaiz(Matematica mat1) {
        double x = 0;
        if (mat1.getNum1() < mat1.getNum2()) {
            Math.abs(mat1.getNum1());
            x = Math.sqrt(Math.abs(mat1.getNum1()));
        } else {
            x = Math.sqrt(Math.abs(mat1.getNum2()));
        }

        return x;
    }

}
