/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasedate;

import java.util.Date;

/**
 *
 * @author crist
 */
public class ClaseDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();*/

        
        Date fecha = new Date(92,6,24);
        System.out.println(fecha.toString());

        Date fecha2 = new Date();
        System.out.println(fecha2.toString());
        
        long dif = fecha.getTime();
        // fecha.getYear(); puedo usar esto para no pasar los milisegundos a años, y trabajar solo con años
        System.out.println("ms entre 1992-7-24 y 1970-1-1: "+dif);
        
        long dif2= fecha2.getTime();
        //fecha2.getYear();
        System.out.println("ms entre fecha actual y 1970-1-1: "+dif2);
        
        double SecsToYears = (dif2-dif)*(3.2*Math.pow(10, -11));
        System.out.println("Cantidad de años entre fecha y fecha2: "+SecsToYears);

    }

}
