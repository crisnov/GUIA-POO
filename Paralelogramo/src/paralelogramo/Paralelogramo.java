/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paralelogramo;

import paralelogramo.entidades.Rectangulo;
import paralelogramo.servicios.ServicioParalelogramo;

/**
 *
 * @author crist
 */
public class Paralelogramo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.*/

        ServicioParalelogramo sp = new ServicioParalelogramo();
        Rectangulo r1 = sp.crearRectangulo();
        System.out.println(r1);
        
        System.out.println(" ");
        
        Rectangulo r2 = new Rectangulo();
        r2.setB(4);
        r2.setH(4);
        System.out.println(r2);
        
        sp.Area(r1);
        sp.Perimetro(r1, r1);
        sp.DibujarRectangulo(r1, r1);
    }

}
