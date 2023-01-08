/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso.servicios;

import java.util.Scanner;
import nespresso.entidades.Cafetera;

/**
 *
 * @author crist
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {
        System.out.println("Parfea crear cafetera, ingrese capacidad max (en ml): ");
        int capacidadMax = leer.nextInt();
        int cantidadActual = 0;
        return new Cafetera(capacidadMax, cantidadActual);
    }

    public Cafetera llenarCafetera(Cafetera cafe1) {
        System.out.println(" ");
        System.out.println("Llenaremos la cafetera");
        cafe1.setCantidadActual(cafe1.getCapacidadMax());
        return cafe1;
    }

    public Cafetera servirTaza(Cafetera cafe1, int volTaza) {
        System.out.println("Ingrese tamaño de la taza vacia (en ml): ");
        volTaza = leer.nextInt();
        if (cafe1.getCantidadActual() >= volTaza) {
            cafe1.setCantidadActual(cafe1.getCantidadActual() - volTaza);
        } else {
            System.out.println("La taza se ha llenado en: " + cafe1.getCantidadActual() + " ml");
            cafe1.setCantidadActual(0);
        }
        return cafe1;
    }
    
    public Cafetera vaciarCafetera (Cafetera cafe1) {
        System.out.println("Vaciaremos la cafetera");
        cafe1.setCantidadActual(0);
        System.out.println(cafe1);
        return cafe1;
    }
    
    public Cafetera agregarCafe (Cafetera cafe1) {
        System.out.println("Ingresa cantidad de cafe a agregar: ");
        cafe1.setCantidadActual(leer.nextInt());
        System.out.println(cafe1);
        return cafe1;
    }

}
