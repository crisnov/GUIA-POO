/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import libreria.entidades.Libro;

/**
 *
 * @author crist
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro (ISBN, Titulo, Autor, NroDePaginas):");

        Libro l1 = new Libro((int) (Math.random() * 99999), leer.next(), leer.next(), (int) (Math.random() * 9999));

        // System.out.println(l1.ISBN + " " + l1.Titulo + " " + l1.Autor + " " + l1.NroDePaginas);
        System.out.println(l1);
    }

}
