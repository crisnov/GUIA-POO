/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbancarias;

import operacionesbancarias.entidades.Cuenta;
import operacionesbancarias.servicios.ServicioCuenta;

/**
 *
 * @author crist
 */
public class OperacionesBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
        
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.crearCuenta();
        System.out.println(c1);
        
        //sc.ingresarDinero(0, c1);
        sc.ingresarDineros(0, c1);
        System.out.println(c1);
        
        //sc.retirarDinero(0, c1);
        sc.retirarDineros(0, c1);
        System.out.println(c1);
        
        sc.extraccionRapida(0, c1);
        System.out.println(c1);
        
        sc.consultaSaldo(c1);
        
        sc.consultaDatos(c1);
    }
    
}
