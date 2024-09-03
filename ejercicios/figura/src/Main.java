public class Main {
    public static void main(String[] args) {
        Figura trapecio = new Trapecio("Trapecio", "Rojo", 10, 5, 4);
        System.out.println("\nNombre: " + trapecio.getNombre());
        System.out.println("Color: " + trapecio.getColor());
        System.out.println("El área del trapecio es: " + trapecio.calcularArea());

        Figura circulo = new Circulo("Círculo", "Azul", 3);
        System.out.println("\nNombre: " + circulo.getNombre() + "🔴");
        System.out.println("Color: " + circulo.getColor());
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        Figura cuadrado = new Cuadrado("Cuadrado", "Amarillo", 10);
        System.out.println("\nNombre: " + cuadrado.getNombre() + "🟨");
        System.out.println("Color: " + cuadrado.getColor());
        System.out.println("El área del cuadrado es: " + cuadrado.calcularArea());
    }
}