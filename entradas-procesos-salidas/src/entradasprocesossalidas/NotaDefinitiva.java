/* Este programa permite leer tres notas de los parciales y mostrar su definitiva aplicando los respectivos porcentajes:
 Primer y Segundo Parcial 25%, Final del 20% y también lee las 3 notas de los talleres 30% (tres talleres por separado)
 */

/*
@autor: Leydi Madrid
@fecha: 20/09/2024
*/


package entradasprocesossalidas;

import java.util.Scanner;

public class NotaDefinitiva {
    public static void main(String[] args) {
        //Declarar variables
        float notaPrimerParcial, notaSegundoParcial, notaTercerParcial;
        float calificacionPrimerParcial, calificacionSegundoParcial, calificacionTercerParcial;
        float notaTaller1, notaTaller2, notaTaller3;
        float calificaciónTaller1, calificaciónTaller2, calificaciónTaller3;
        float notaDefinitiva;


        System.out.println("\n----- NOTAS DEFINITIVAS ----\n");
        //Entradas
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la nota del primer parcial: ");
        notaPrimerParcial = teclado.nextFloat();
        System.out.print("Ingresa la nota del segundo parcial: ");
        notaSegundoParcial = teclado.nextFloat();
        System.out.print("Ingresa la nota del tercer parcial: ");
        notaTercerParcial = teclado.nextFloat();
        System.out.print("Ingresa la nota del taller 1: ");
        notaTaller1 = teclado.nextFloat();
        System.out.print("Ingresa la nota del taller 2: ");
        notaTaller2 = teclado.nextFloat();
        System.out.print("Ingresa la nota del taller 3: ");
        notaTaller3 = teclado.nextFloat();


        //Procesos
        calificacionPrimerParcial = getCalcularPorcentaje25(notaPrimerParcial);
        calificacionSegundoParcial = getCalcularPorcentaje25(notaSegundoParcial);
        calificacionTercerParcial = getCalcularPorcentaje20(notaTercerParcial);
        calificaciónTaller1 = getCalcularPorcentaje10(notaTaller1);
        calificaciónTaller2 = getCalcularPorcentaje10(notaTaller2);
        calificaciónTaller3 = getCalcularPorcentaje10(notaTaller3);
        notaDefinitiva = calificacionPrimerParcial + calificacionSegundoParcial + calificacionTercerParcial +
                calificaciónTaller1 + calificaciónTaller2 + calificaciónTaller3;

        //Salidas
        System.out.println("\nSu nota definitiva es: " + notaDefinitiva);

        if (notaDefinitiva >= 3) {
            System.out.println("Aprobaste la materia 👏");
        } else {
            System.out.println("Perdiste la materia 😥");
        }
    }

    public static float getCalcularPorcentaje10(float nota) {
        float calificacion = (nota * 10) / 100;
        return calificacion;
    }

    public static float getCalcularPorcentaje20(float nota) {
        float calificacion = (nota * 20) / 100;
        return calificacion;
    }

    public static float getCalcularPorcentaje25(float nota) {
        float calificacion = (nota * 25) / 100;
        return calificacion;
    }


}
