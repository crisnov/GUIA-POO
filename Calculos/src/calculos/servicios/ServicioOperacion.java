/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculos.servicios;

import calculos.entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioOperacion {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        System.out.println("Ingrese numero1 y numero2: ");
        double numero1 = leer.nextDouble();
        double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public void sumar(Operacion numero1, Operacion numero2) {
        double sumar = numero1.getNumero1() + numero2.getNumero2();
        System.out.println("La suma entre numero1 y numero 2 vale: " + sumar);
    }

    public void restar(Operacion numero1, Operacion numero2) {
        double restar = numero1.getNumero1() - numero2.getNumero2();
        System.out.println("La resta entre numero1 y numero 2 vale: " + restar);
    }

    public double multiplicar(Operacion numero1, Operacion numero2) {
        double multiplicar = 0;
        if (numero1.getNumero1() == 0 || numero2.getNumero2() == 0) {
            System.out.println("Error, uno de los numeros ingresados es 0");
        } else {
            multiplicar = numero1.getNumero1() * numero2.getNumero2();
        }

        return multiplicar;
    }

    public double division(Operacion numero1, Operacion numero2) {
        if (numero1.getNumero1() == 0 || numero2.getNumero2() == 0) {
            System.out.println("Error, uno de los numeros ingresados es 0");
            return 0;
        } else {
            double division = numero1.getNumero1() / numero2.getNumero2();
            return division;
        }
    }

}
