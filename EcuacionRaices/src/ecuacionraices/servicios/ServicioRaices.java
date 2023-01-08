/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuacionraices.servicios;

import ecuacionraices.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioRaices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Raices crearRaices() {

        int a = 0;
        do {
            System.out.println("Ingrese el coef cuadratico 'a' : ");
            a = leer.nextInt();
        } while (a == 0);

        System.out.println("Ingrese el coef lineal 'b' : ");
        int b = leer.nextInt();

        System.out.println("Ingrese el termino indepte 'c' : ");
        int c = leer.nextInt();

        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices R1) {

        //System.out.println("A continuacion calcularemos el discriminante");
        double discriminante = Math.pow(R1.getB(), 2) - (4 * R1.getA() * R1.getC());
        //System.out.println("Discriminante (Δ): " + discriminante);
        return discriminante;
    }

    public boolean tieneRaices(Raices R1) {
        boolean x = false;
        double q = getDiscriminante(R1);

        if (q > 0) {
            //System.out.println("Δ > 0, tiene dos soluciones");
            x = true;
        }

        return x;
    }

    public boolean tieneRaiz(Raices R1) {
        boolean w = false;
        double t = getDiscriminante(R1);

        if (t == 0) {
            
            //System.out.println("Δ = 0, tiene una raiz real, pero de multiplicidad doble");
            w = true;
        }

        return w;
    }

    public void obtenerRaices(Raices R1) {

        boolean z = tieneRaices(R1);

        if (z == true) {
            System.out.println(" ");
            double e = (-R1.getB() + Math.sqrt(getDiscriminante(R1))) / (2 * R1.getA());
            System.out.println("x1 = " + e);

            double r = (-R1.getB() - Math.sqrt(getDiscriminante(R1))) / (2 * R1.getA());
            System.out.println("x1 = " + r);
        }

    }
    
    public void obtenerRaiz(Raices R1) {

        boolean f = tieneRaiz(R1);

        if (f == true) {
            System.out.println(" ");
            double e = (-R1.getB()) / (2 * R1.getA());
            System.out.println("x1,2 = " + e);
        }

    }
    
    public void calcular(Raices R1) {

        boolean g = tieneRaiz(R1);
        boolean h = tieneRaices(R1);
        double j = getDiscriminante(R1);

        if (j > 0) {
            System.out.println(" ");
            System.out.println("Δ > 0, tiene dos soluciones");
            obtenerRaices(R1);          
        } else if (j==0){
            System.out.println(" ");
            System.out.println("Δ = 0, tiene una raiz real, pero de multiplicidad doble");
            obtenerRaiz(R1);
        } else {
            System.out.println(" ");
            System.out.println("No tiene raices reales. Existen dos raíces complejas conjugadas.");
        }

    }

}
