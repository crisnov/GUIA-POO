/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculosCircunferencia.servicios;

import Circunferencia.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioCircunferencia {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

        System.out.println("Ingrese radio de la circunferencia: ");
        double r = leer.nextDouble();

        return new Circunferencia(r);
    }

    public void Area(Circunferencia r) {
        double area = Math.PI * (r.getR()) * (r.getR());
        System.out.println(" ");
        System.out.println("El area es: " + area);
    }

    public void Perimetro(Circunferencia r) {
        double longCircu = 2 * Math.PI * (r.getR());
        System.out.println(" ");
        System.out.println("El perimetro vale: " + longCircu);
    }
}
