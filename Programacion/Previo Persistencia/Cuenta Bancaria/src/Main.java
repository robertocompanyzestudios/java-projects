/*
* Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un enterolargo),
*  el DNI del cliente (otro entero largo) y el saldo actual. Define en la clase los siguientes métodos:
*   Constructor por defecto y constructor con DNI y saldo.
*   ingresar(double): permitirá ingresar una cantidad en la cuenta.
*   retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
*   Metodo que nos permita mostrar todos los datos de la cuenta.
*
* Consideraciones:
*  El número de cuenta se asignará de forma correlativa a partir de 100001, asignando el siguiente número al último asignado.
*  Crea una clase Principal, con el metodo  main(), para probar la funcionalidad de la clase Cuenta.
* 
* */

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(49339925, 39.2);
        Cuenta cuenta2 = new Cuenta(49339924, 12.3);

        System.out.println(cuenta1.info());
        System.out.println(cuenta2.info());

        cuenta1.ingresar(3000000.01);
        System.out.println(cuenta1.info());



    }
}
