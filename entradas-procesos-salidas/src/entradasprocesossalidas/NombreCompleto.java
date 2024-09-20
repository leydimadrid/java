/* Este programa permite recibir nombres y apellidos y devolverlos en orden contrario de como se ingresaron */
/*
@autor: Leydi Madrid
@fecha: 20/09/2024
 */

package entradasprocesossalidas;

import java.util.Scanner;

public class NombreCompleto {
    public static void main(String[] args) {

        //Declarar variables
        String nombres, apellidos, nombreCompleto;

        System.out.println("\n---- NOMBRE COMPLETO ----\n");

        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese sus nombres: ");
        nombres = teclado.nextLine();
        System.out.print("Ingrese sus apellidos: ");
        apellidos = teclado.nextLine();

        //Procesos
        nombreCompleto = apellidos + " " + nombres;

        //Salidas
        System.out.println("Su nombre completo es: " + nombreCompleto);


    }
}
