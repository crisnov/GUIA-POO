/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbancarias.servicios;

import java.util.Scanner;
import operacionesbancarias.entidades.Cuenta;

/**
 *
 * @author crist
 */
public class ServicioCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        long dni = 0;
        do {
            System.out.println("Ingrese DNI de 7 o mas digitos: ");
            dni = leer.nextLong();
        } while (Math.floor(Math.log10(Math.abs(dni)) + 1) < 7);
        /*System.out.println("Ingrese DNI: ");
        long dni = leer.nextLong();
        while (Math.floor(Math.log10(Math.abs(dni)) + 1) < 7){
            System.out.println("Ingrese DNI de 7 o mas digitos: ");
            dni = leer.nextLong();
        }*/
        int numCuenta = 0;
        do {
            System.out.println("Ingrese nº de cuenta: ");
            numCuenta = leer.nextInt();
        } while (numCuenta < 0);

        System.out.println("Ingrese saldo actual: ");
        int saldoActual = leer.nextInt();

        return new Cuenta(numCuenta, dni, saldoActual);
    }

    /*public void ingresarDinero(int ingresoDinero, Cuenta saldoActual) {
        System.out.println(" ");
        System.out.println("Indique la cantidad de dinero que desea ingresar: ");
        ingresoDinero = leer.nextInt();
        int saldo1 = saldoActual.getSaldoActual() + ingresoDinero;
        saldoActual.setSaldoActual(saldo1);
    }*/
    public Cuenta ingresarDineros(int ingresoDineros, Cuenta c1) {
        System.out.println(" ");
        System.out.println("Indique la cantidad de dinero que desea ingresar: ");
        ingresoDineros = leer.nextInt();
        c1.setSaldoActual(c1.getSaldoActual() + ingresoDineros);
        return c1;
    }

    /*public void retirarDinero(int retiroDinero, Cuenta saldoActual) {
        System.out.println(" ");
        System.out.println("Indique la cantidad de dinero que desea retirar: ");
        retiroDinero = leer.nextInt();
        if (retiroDinero > saldoActual.getSaldoActual()) {
            saldoActual.setSaldoActual(0);
        } else {
            int saldo2 = saldoActual.getSaldoActual() - retiroDinero;
            saldoActual.setSaldoActual(saldo2);
        }
    }*/
    public Cuenta retirarDineros(int retirarDineros, Cuenta c1) {
        System.out.println(" ");
        System.out.println("Indique la cantidad de dinero que desea retirar: ");
        retirarDineros = leer.nextInt();
        if (retirarDineros > c1.getSaldoActual()) {
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retirarDineros);
        }
        return c1;
    }

    public Cuenta extraccionRapida(int extra, Cuenta c1) {
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de dinero a extraer de forma rapida: ");
        extra = leer.nextInt();
        while (extra != (c1.getSaldoActual() * 0.2)) {
            System.out.println("Ingrese cantidad a extraer rapidamente, solo un 20%: ");
            extra = leer.nextInt();
        }
        c1.setSaldoActual(c1.getSaldoActual() - extra);
        return c1;
    }

    public Cuenta consultaSaldo(Cuenta c1) {
        System.out.println("El saldo disponible en su cuenta es: " + c1.getSaldoActual());
        return c1;
    }

    public Cuenta consultaDatos(Cuenta c1) {
        System.out.println(c1);
        return c1;
    }

}
