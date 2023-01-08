/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociedad.servicios;

import java.util.Scanner;
import sociedad.entidades.Persona;

/**
 *
 * @author crist
 */
public class ServicioPersona {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona() {
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();
        p1.setNombre(nombre);
        System.out.println("Ingrese edad: ");
        int edad = leer.nextInt();
        p1.setEdad(edad);
        String sexo=" ";
        do {
            System.out.println("Ingrese sexo ('hombre' - 'mujer' - 'otro') ");
            sexo = leer.next();
            p1.setSexo(sexo);
            if (!(p1.getSexo().toUpperCase().equals("HOMBRE") || p1.getSexo().toUpperCase().equals("MUJER") || p1.getSexo().toUpperCase().equals("OTRO"))) {
                System.out.println(" ");
                System.out.println("INGRESE UNA OPCION VALIDA");
            } else {
                System.out.println(" ");
                System.out.println("CORRECTO");
                p1.setSexo(sexo);
            }
        } while (!(p1.getSexo().toUpperCase().equals("HOMBRE") || p1.getSexo().toUpperCase().equals("MUJER") || p1.getSexo().toUpperCase().equals("OTRO")));
        
        System.out.println("Ingrese peso: ");
        int peso = leer.nextInt();
        p1.setPeso(peso);
        System.out.println("Ingrese altura: ");
        double altura = leer.nextDouble();
        p1.setAltura(altura);
        
        return p1;
    }
    
    public int calcularIMC(Persona p1) {
        double q = (p1.getPeso() / Math.pow(p1.getAltura(), 2));
        int x = 0;
        
        if (q < 20) {
            System.out.println("Su IMC es " + (Math.round(q * 100.0) / 100.0) + ", lo que indica que su peso está en la categoría de Bajo peso para adultos de su misma estatura");
            x = (-1);
        } else if (q > 25) {
            System.out.println("Su IMC es " + (Math.round(q * 100.0) / 100.0) + ", lo que indica que su peso está en la categoría de Sobrepeso para adultos de su misma estatura");
            x = 1;
        } else {
            System.out.println("Su IMC es " + (Math.round(q * 100.0) / 100.0) + ", lo que indica que su peso está en la categoría de Peso saludable para adultos de su misma estatura");
            x = 0;
        }
        return x;
    }
    
    public boolean esMayorDeEdad(Persona p1) {
        boolean z = false;
        if (p1.getEdad() >= 18) {
            z = true;
            //System.out.println("Mayor de edad: " + z);
        } else {
            //System.out.println("Mayor de edad: " + z);
           
        }
        return z;
    }
}
