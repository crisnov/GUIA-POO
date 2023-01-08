/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesmatematicas;

import operacionesmatematicas.entidades.Matematica;
import operacionesmatematicas.servicios.ServicioMatematica;

/**
 *
 * @author crist
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
        
        ServicioMatematica sm = new ServicioMatematica();
        
        Matematica m1 = sm.crearMatematica();
        System.out.println(m1);
        
        System.out.println(sm.devolverMayor(m1));
        
        System.out.println(sm.calcularPotencia(m1));
        
        System.out.println(sm.calcularRaiz(m1));
        
    }
    
}
