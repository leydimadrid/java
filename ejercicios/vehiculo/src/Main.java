public class Main {
    public static void main(String[] args) {
        System.out.println("\n---Vehículos 🏍️🚗---\n");
        Vehiculo mazda3 = new Carro("Mazda", "Blanco", 4, 4, 2, "Mazda3" );
        System.out.println(mazda3);
        System.out.println(mazda3.acelerar());
        System.out.println("\n");
        Vehiculo szrr = new Moto("Yamaha", "Negra", 2, 0, 149, "SZRR2015");
        System.out.println(szrr);
        System.out.println(szrr.frenar());
    }
}