/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoverificador.servicios;

import digitoverificador.entidades.NIF;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class ServicioNIF {

    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    String[] vector = new String[23];

    public NIF crearNIF() {
        System.out.println("Ingrese DNI: ");
        long dni = leer.nextLong();
        int resto = (int) (dni % 23);

        rellenarVector(vector);

        String letra = "";
        for (int i = 0; i < 23; i++) {
            if (resto == i) {
                letra = vector[i];
            }
        }

        return new NIF(dni, letra);
    }

    public String[] rellenarVector(String[] vector) {
        vector[0] = "T";
        vector[1] = "R";
        vector[2] = "W";
        vector[3] = "A";
        vector[4] = "G";
        vector[5] = "M";
        vector[6] = "Y";
        vector[7] = "F";
        vector[8] = "P";
        vector[9] = "D";
        vector[10] = "X";
        vector[11] = "B";
        vector[12] = "N";
        vector[13] = "J";
        vector[14] = "Z";
        vector[15] = "S";
        vector[16] = "Q";
        vector[17] = "V";
        vector[18] = "H";
        vector[19] = "L";
        vector[20] = "C";
        vector[21] = "K";
        vector[22] = "E";

        String aux = " ";
        System.out.println("* vector[i]:");
        for (String elemento : vector) {
            aux = aux + " | " + elemento;
        }
        System.out.println(aux + " |");

        return vector;
    }
    
    public void mostrarNIF(NIF n1){
        System.out.println("NIF: "+n1.getDNI()+"-"+n1.getCar());
    }
}
