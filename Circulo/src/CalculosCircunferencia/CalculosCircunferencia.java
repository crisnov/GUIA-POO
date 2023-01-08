/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculosCircunferencia;

import CalculosCircunferencia.servicios.ServicioCircunferencia;
import Circunferencia.entidades.Circunferencia;

/**
 *
 * @author crist
 */
public class CalculosCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).*/
        
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c1 = sc.crearCircunferencia();
        System.out.println(c1);

        sc.Area(c1);
        sc.Perimetro(c1);
    }

}
