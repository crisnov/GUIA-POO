/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelogramo.servicios;

import java.util.Scanner;
import paralelogramo.entidades.Rectangulo;

/**
 *
 * @author crist
 */
public class ServicioParalelogramo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base, b, del rectangulo: ");
        double b = leer.nextDouble();
        System.out.println("Ingrese la altura, h, del rectangulo: ");
        double h = leer.nextDouble();

        return new Rectangulo(b, h);
    }

    public void Area(Rectangulo r1) {
        double sup = r1.getB() * r1.getH();
        System.out.println(" ");
        System.out.println("El area es: " + sup);

    }

    public void Perimetro(Rectangulo b, Rectangulo h) {
        double perim = (b.getB() + h.getH()) * 2;
        System.out.println(" ");
        System.out.println("El perimetro es: " + perim);
    }

    public void DibujarRectangulo(Rectangulo b, Rectangulo h) {
        System.out.println(" ");
        //Primer Fila
        for (int j = 0; j < b.getB(); j++) {
            System.out.print("*");
        }
        System.out.println();

        //Filas Intermedias
        for (int i = 0; i < h.getH() - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < b.getB() - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        //Ultima Fila
        for (int j = 0; j < b.getB(); j++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
