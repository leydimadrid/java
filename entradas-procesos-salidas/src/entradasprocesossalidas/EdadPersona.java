/*Este programa permite hallar la edad de una persona, conociendo su año de nacimiento */

/*
@autor: Leydi Madrid
@fecha: 20/09/2024
 */


package entradasprocesossalidas;

import java.util.Scanner;

public class EdadPersona {
    public static void main(String[] args) {
        //Declarar variables
        int nacimiento;
        int ANO_ACTUAL = 2024;
        int edadActual;

        System.out.println("\n---- EDAD ACTUAL ----\n");

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el año de su nacimiento: ");
        nacimiento = teclado.nextInt();

        //Procesos
        edadActual = getCalcularEdad(ANO_ACTUAL, nacimiento);

        //Salidas
        System.out.print("Tienes: " + edadActual + " años");

    }

    public static int getCalcularEdad (int ANO_ACTUAL, int nacimiento) {
        int edadActual = ANO_ACTUAL - nacimiento;
        return edadActual;
    }
}
