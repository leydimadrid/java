import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner lectura = new Scanner(System.in); // Recibir datos por la consola
            System.out.println("\n---CALCULADORA 📱---");
            System.out.println("Ingrese su nombre: ");
            String nombre = lectura.next(); // Capturar datos tipo string
            System.out.println("\nHola 👋 " + nombre);
            System.out.println("\nOperaciones: \n1- Suma \n2- Resta \n3- Multiplicación \n4- División \n5- Salir");
            System.out.println("\nPresiona el número correspondiente a la operación que deseas realizar:");
            int operacion = lectura.nextInt(); // Capturar datos int

            if (operacion >= 1 && operacion <= 4) {
                System.out.println("\n" + nombre + "," + " vamos a realizar la operación " + operacion);
                System.out.println("\nIngresa el número 1: ");
                int primerNumero = lectura.nextInt(); // Capturar datos int
                System.out.println("Ingresa el número 2: ");
                int segundoNumero = lectura.nextInt(); // Capturar datos int


                switch (operacion) {
                    case 1:
                        int suma = primerNumero + segundoNumero;
                        System.out.println("\nEl resultado de la suma es: " + suma + "😁");
                        break;
                    case 2:
                        int resta = primerNumero - segundoNumero;
                        System.out.println("\nEl resultado de la resta es: " + resta + "😁");
                        break;
                    case 3:
                        int multiplicacion = primerNumero * segundoNumero;
                        System.out.println("\nEl resultado de la multiplicación es: " + multiplicacion + "😁");
                        break;
                    case 4:
                        int division = primerNumero / segundoNumero;
                        System.out.println("\nEl resultado de la división es: " + division + "😁");
                        break;
                }
            } else if (operacion == 5) {
                System.out.println("\n¡Hasta luego!👋 Has salido de la calculadora 😔\n");
            } else {
                System.out.println("\nEsa operación no existe, ingresa una operación válida 😕");
            }
        }
    }
}