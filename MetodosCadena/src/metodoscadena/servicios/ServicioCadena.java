/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoscadena.servicios;

import java.util.Locale;
import java.util.Scanner;
import metodoscadena.entidades.Cadena;

/**
 *
 * @author crist
 */
public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    public Cadena crearCadena() {
        System.out.println("Ingrese frase: ");
        String frase = leer.next();
        int longFrase = frase.length();
        
        return new Cadena(frase, longFrase);
    }
    
    public void mostrarVocales(Cadena C1) {
        int cont = 0;
        for (int i = 0; i < C1.getLongFrase(); i++) {
            
            if (C1.getFrase().substring(i, i + 1).equalsIgnoreCase("a") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("e") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("i") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("o") || C1.getFrase().substring(i, i + 1).equalsIgnoreCase("u")) {
                cont++;
            }
        }
        System.out.println("Cantidad de vocales: " + cont);
    }
    
    public String invertirFrase(Cadena c1) {
        String cadenaInvertida = "";
        for (int i = c1.getLongFrase() - 1; i >= 0; i--) {
            cadenaInvertida += c1.getFrase().charAt(i);
        }
        return cadenaInvertida;
    }
    
    public int vecesRepetidos(Cadena c1) {
        System.out.println("Ingrese un caracter a buscar en la frase: ");
        String caracter = leer.next();
        
        int contt = 0;
        for (int i = 0; i < c1.getLongFrase() - 1; i++) {
            if (c1.getFrase().substring(i, i + 1).equalsIgnoreCase(caracter)) {
                contt++;
            }
        }
        return contt;
    }
    
    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese frase para comparar su long: ");
        String frase2 = leer.next();
        System.out.println("longitud frase2: " + frase2.length());
        System.out.println("longitud frase: " + c1.getLongFrase());
    }
    
    public String unirFrases(Cadena c1) {
        System.out.println("Ingrese frase para unir a la anterior: ");
        String frase2 = leer.next();
        
        String union = c1.getFrase() + " " + frase2;
        
        return union;
    }
    
    public String reemplazar(Cadena c1) {
        System.out.println("ingrese un caracter para luego reemplazar: ");
        String letra = leer.next().toLowerCase();
        
        String l = c1.getFrase().toLowerCase().replace("a", letra);
        c1.setFrase(l);
        return l;
    }
    
    public boolean contiene(Cadena c1) {
        boolean x = false;
        System.out.println("ingrese letra a buscar: ");
        String buscar = leer.next();
        String str = c1.getFrase();
        
        if (str.contains(buscar) == true) {
            x = true;
            System.out.println("verdadero");
        }
        return x;
    }
}
