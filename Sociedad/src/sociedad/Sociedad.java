/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociedad;

import sociedad.entidades.Persona;
import sociedad.servicios.ServicioPersona;

/**
 *
 * @author crist
 */
public class Sociedad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.*/

        ServicioPersona sp = new ServicioPersona();
        int i = 0, j = 0, k = 0, l = 0, y = 0;

        //Persona p1 = sp.crearPersona();
                
        Persona p1 =null;
        try {
             p1 =null;
        } catch (Exception e) {
            System.out.println(e);
        } finally{
            System.out.println("A continuacion pediremos los datos de la persona");
          p1 = sp.crearPersona();
        }

        //  int z1 = sp.calcularIMC(p1);
        boolean w1 = sp.esMayorDeEdad(p1);

//        switch (z1) {
//            case 1:
//                i++;
//                break;
//            case 0:
//                j++;
//                break;
//            default:
//                k++;
//                break;
//        }
//        if (w1 == true) {
//            l++;
//        }

        /*  Persona p2 = sp.crearPersona();
        int z2 = sp.calcularIMC(p2);
        boolean w2 = sp.esMayorDeEdad(p2);

        switch (z2) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (w2 == true) {
            l++;
        }

        Persona p3 = sp.crearPersona();
        int z3 = sp.calcularIMC(p3);
        boolean w3 = sp.esMayorDeEdad(p3);

        switch (z3) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (w3 == true) {
            l++;
        }

        Persona p4 = sp.crearPersona();
        int z4 = sp.calcularIMC(p4);
        boolean w4 = sp.esMayorDeEdad(p4);

        switch (z3) {
            case 1:
                i++;
                break;
            case 0:
                j++;
                break;
            default:
                k++;
                break;
        }
        if (w3 == true) {
            l++;
        }

        System.out.println("porcentaje de sobrepeso: %" + ((double) i / 4) * 100);
        System.out.println("porcentaje peso ideal: %" + ((double) j / 4) * 100);
        System.out.println("porcentaje por debajo del peso ideal: %" + ((double) k / 4) * 100);
        System.out.println("porcentaje de mayores de edad: %" + ((double) l / 4) * 100);
        //System.out.println("Cantidad de personas en peso ideal: " + (j / 4) * 100 + "%");
        //System.out.println("Cantidad de personas mayores de edad: " + (l / 4) * 100 + "%");
         */
    }

}
