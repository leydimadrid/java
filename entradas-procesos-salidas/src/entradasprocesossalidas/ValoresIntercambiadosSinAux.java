/* Este programa permite ingresar dos valores diferentes, almacenarlos en dos variables y al momento de mostrarlos
sus valores internamente han sido intercambiados, no se usa variable auxiliar */
/*
@autor: Leydi Madrid
@fecha: 20/09/2024
 */

package entradasprocesossalidas;

import java.util.Scanner;

public class ValoresIntercambiadosSinAux {
    public static void main(String[] args) {
        //Declarar variables
        int a, b;

        System.out.println("\n---- VALORES INTERCAMBIADOS SIN AUX ----\n");

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor 1: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor 2: ");
        b = teclado.nextInt();
        System.out.println("\nValores iniciales\n" + "Valor 1: " + a + "\nValor 2: " + b + "\n");

        //Procesos
        a = a + b;
        b = a - b;
        a = a - b;

        //Salidas
        System.out.println("Valores intercambiados\n");
        System.out.println("El valor 1 es: " + a);
        System.out.println("El valor 2 es: " + b);

    }
}
