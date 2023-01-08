/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntopersonas.servicios;

import conjuntopersonas.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioPersonas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese nombre de la persona: ");
        String nombre = leer.next();
        System.out.println("Ingrese fecha de nacimiento (AA/MM/DD) ");
        Date fechaNac = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());

        return new Persona(nombre, fechaNac);
    }
    
    public Persona calcularEdad(Persona P1) {
        Date fech = P1.getFechanNac();
        System.out.println("Fecha nacimiento: "+fech.toString());
        
        Date fecha2 = new Date();
        System.out.println("Fecha actual: "+fecha2.toString());
        
        long dif = fech.getTime();
        System.out.println("ms entre fecha nacimiento y 1970-1-1: "+dif);
        
        long dif2= fecha2.getTime();
        System.out.println("ms entre fecha actual y 1970-1-1: "+dif2);
        
        double SexToYears = (dif2-dif)*(3.2*Math.pow(10, -11));
        System.out.println("Cantidad de años entre fecha y fecha2: "+SexToYears);
        
        return P1;
    }
    
    public Boolean menorQue(Persona P1, int edad){
        boolean x = false;
        Date fecha=P1.getFechanNac();
        long diff = fecha.getTime();
        double secsToYears = (diff)*(3.2*Math.pow(10, -11));
        
        if (secsToYears > edad){
            x = true;
            //System.out.println("Edad ingresada por parametro es menor? "+ x);
        }
        
        return x;
    }

}
