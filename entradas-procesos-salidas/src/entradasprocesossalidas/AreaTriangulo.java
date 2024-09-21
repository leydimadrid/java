/*
Este programa cálcula el área y perímetro de un triángulo
 */

/*
@autor: Profe
@fecha: 18/09/2024
 */

package entradasprocesossalidas;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        //1.Declarar e inicializar variables
        float base, altura, area, perimetro, lado1, lado2 = 0.0f;
        Scanner teclado = new Scanner(System.in);

        //2. Entradas
        System.out.println("\n*** PROGRAMA QUE CÁLCULA EL ÁREA Y PERÍMETRO DE UN TRIÁNGULO ***\n");
        System.out.print("Ingrese base: ");
        base = teclado.nextFloat();
        System.out.print("Ingrese lado 1: ");
        lado1 = teclado.nextFloat();
        System.out.print("Ingrese lado 2: ");
        lado2 = teclado.nextFloat();
        System.out.print("Ingrese altura: ");
        altura = teclado.nextFloat();

        //3. Procesos
        area = getCalcularArea(base, altura);
        perimetro = getCalcularPerimetro(base, lado1, lado2);

        //4. Salidas (Se llama el procedimiento)
        generarSalida(base, lado1, lado2, altura, area, perimetro);

    }

    public static float getCalcularArea(float base, float altura) {
        float area = (base * altura) / 2;
        return area;
    }

    public static float getCalcularPerimetro(float base, float lado1, float lado2) {
        float perimetro = base + lado1 + lado2;
        return perimetro;
    }

    public static void generarSalida(float base, float lado1, float lado2, float altura, float area
            , float perimetro) {
        System.out.println("\n: " + base);
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Altura: " + altura + "\n");
        System.out.println("Resultado área: " + area);
        System.out.println("Resultado perímetro: " + perimetro);

    }
}
