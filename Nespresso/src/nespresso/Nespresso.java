/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import nespresso.entidades.Cafetera;
import nespresso.servicios.ServicioCafetera;

/**
 *
 * @author crist
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCafetera sc = new ServicioCafetera();
        Cafetera cafe1 = sc.crearCafetera();
        System.out.println(cafe1);
        
        sc.llenarCafetera(cafe1);
        System.out.println(cafe1);
        
        sc.servirTaza(cafe1, 0);
        System.out.println(cafe1);
        
        sc.vaciarCafetera(cafe1);
        
        sc.agregarCafe(cafe1);
    }
    
    
}
