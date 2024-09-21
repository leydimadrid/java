/* Programa para leer dos números y hallar la sumatoria, su diferencia, su producto, su cociente, y su residuo.*/

/*
@autor: Profe Joaquin
@fecha: 19/09/2024
 */


package entradasprocesossalidas;

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        //DECLARACIÓN DE VARIABLES
        //Variables de entrada
        float numero1 = 0;
        float numero2 = 0;

        //Variable de resultado
        float sumatoria = 0;
        float diferencia = 0;
        float producto = 0;
        float cociente = 0;
        float residuo = 0;

        //Variable que representa la captura de los datos (teclado)
        Scanner teclado = new Scanner(System.in);

        //ENTRADAS
        System.out.print("Digita el primer número: ");
        numero1 = teclado.nextFloat();
        System.out.print("Digita el segundo número: ");
        numero2 = teclado.nextFloat();

        //PROCESOS
        sumatoria = numero1 + numero2;
        diferencia = numero1 - numero2;
        producto = numero1 * numero2;
        cociente = numero1 / numero2;
        residuo = numero1 % numero2;

        //SALIDAS
        System.out.println("Sumatoria: " + sumatoria);
        System.out.println("Diferencia: " + diferencia);
        System.out.println("Producto: " + producto);
        System.out.println("Cociente: " + cociente);
        System.out.println("Residuo: " + residuo);
    }
}
