public class Main {
    public static void main(String[] args) {
        System.out.println("\n----Ordenador----");
        Ordenador ordenador1 = new Ordenador("HP", "HP Pavilion 15", 8, 256);
        System.out.println(ordenador1);
        ordenador1.encender();
        ordenador1.transferirArchivos(50);
        ordenador1.eliminarArchivos(10);
        ordenador1.apagar();
        ordenador1.transferirArchivos(10);

        System.out.println("--------------------------------");

        Ordenador ordenador2 = new Ordenador("HP", "HP Pavilion 15", 8, 300);
        System.out.println(ordenador2);
        ordenador2.encender();
        ordenador2.transferirArchivos(50);
        ordenador2.eliminarArchivos(10);
        Ordenador.validarOrdenador(ordenador1, ordenador2);

    }
}