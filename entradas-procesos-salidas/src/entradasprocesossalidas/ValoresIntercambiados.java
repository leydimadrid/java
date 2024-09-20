/* Este programa permite ingresar dos valores diferentes, almacenarlos en dos variables y al momento de mostrarlos
sus valores internamente han sido intercambiados, se usa una variable auxiliar */

/*
@autor: Leydi Madrid
@fecha: 20/09/2024
 */


package entradasprocesossalidas;

import java.util.Scanner;

public class ValoresIntercambiados {
    public static void main(String[] args) {

        //Declarar variables
        int a, b, aux;


        System.out.println("---- VALORES INTERCAMBIADOS CON AUX ----");

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor 1: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor 2: ");
        b = teclado.nextInt();
        System.out.println("\nValores iniciales\n" + "Valor 1: " + a + "\nValor 2: " + b + "\n");

        //Procesos
        aux = a;
        a = b;
        b = aux;

        //Salidas
        System.out.println("Valores intercambiados\n");
        System.out.println("El valor 1 es: " + a);
        System.out.println("El valor 2 es: " + b);
    }
}
