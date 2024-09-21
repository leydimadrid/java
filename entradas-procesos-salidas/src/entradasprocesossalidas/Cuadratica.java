/*Este programa nos da el resultado de una ecuación de segundo grado*/

/*
@autor: Profe Jhon
@fecha: 20/09/2024
 */

package entradasprocesossalidas;

import java.util.Scanner;

public class Cuadratica {
    public static void main(String[] args) {
        //Declarar variables
        int a, c;
        double b;
        double raizPositiva;
        double raizNegativa;

        System.out.println("---- CUADRATICA ----");

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el valor A: ");
        a = teclado.nextInt();
        System.out.print("Ingrese el valor B: ");
        b = teclado.nextInt();
        System.out.print("Ingrese el valor C: ");
        c = teclado.nextInt();

        //Procesos
        raizPositiva = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        raizNegativa = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        //Salidas
        System.out.println("Raíz positiva " + raizPositiva);
        System.out.println("Raíz positiva " + raizNegativa);


    }
}
