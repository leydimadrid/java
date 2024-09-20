public class Ordenador {

    private String marca;
    private String modelo;
    private int gbRam;
    private int capacidadDiscoDuro = 50;
    private int espacioUtilizadoDiscoDuro;
    private boolean isEncendido = false;


    public Ordenador() {
    }

    public Ordenador(int gbRam, int capacidadDiscoDuro) {
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public Ordenador(String marca, String modelo, int gbRam, int capacidadDiscoDuro) {
        this.marca = marca;
        this.modelo = modelo;
        this.gbRam = gbRam;
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGbRam() {
        return gbRam;
    }

    public void setGbRam(int gbRam) {
        this.gbRam = gbRam;
    }

    public int getCapacidadDiscoDuro() {
        return capacidadDiscoDuro;
    }

    public void setCapacidadDiscoDuro(int capacidadDiscoDuro) {
        this.capacidadDiscoDuro = capacidadDiscoDuro;
    }

    public int getEspacioUtilizadoDiscoDuro() {
        return espacioUtilizadoDiscoDuro;
    }

    public void setEspacioUtilizadoDiscoDuro(int espacioUtilizadoDiscoDuro) {
        this.espacioUtilizadoDiscoDuro = espacioUtilizadoDiscoDuro;
    }

    public boolean isEncendido() {
        return isEncendido;
    }

    public void setEncendido(boolean encendido) {
        isEncendido = encendido;
    }

    public String encender() {
        isEncendido = true;
        if (isEncendido) {
            System.out.println("\nEncendiendo ordenador 💻\n");
            System.out.println("Capacidad en Disco duro: " + capacidadDiscoDuro + " GB");
            System.out.println("Espacio utilizado en disco duro: " + espacioUtilizadoDiscoDuro + "GB");
        }
        return "Encendiendo ordenador 💻";
    }

    public String apagar() {
        if (isEncendido == true) {
            System.out.println("\nApagando ordenador 💻\n");
            isEncendido = false;
        }
        return "Apagando ordenador 💻";
    }

    public int transferirArchivos(int espacioRequerido) {
        espacioUtilizadoDiscoDuro = 0;
        if (isEncendido == true) {
            System.out.println("\n----Transferir archivos----");
            if (espacioRequerido > capacidadDiscoDuro) {
                System.out.println("El espacio requerido supera la capacidad del disco duro😕");
            } else {
                espacioUtilizadoDiscoDuro += espacioRequerido;
                System.out.println("Archivos transferidos con éxito ➡️," + " espacio utilizado en Disco duro es de: " + espacioUtilizadoDiscoDuro + "GB");
            }
            capacidadDiscoDuro -= espacioUtilizadoDiscoDuro;
            System.out.println("Espacio en disco duro restante: " + capacidadDiscoDuro + "GB");
        }
        return espacioRequerido;
    }


    public int eliminarArchivos(int espacioEliminado) {
        if (isEncendido == true) {
            System.out.println("\n----Eliminar archivos----");
            if (espacioEliminado > espacioUtilizadoDiscoDuro) {
                espacioUtilizadoDiscoDuro = 0;
                System.out.println("Archivos eliminados con éxito, su espacio utilizado actualmente en Disco duro es de: " + espacioUtilizadoDiscoDuro + "GB");
            } else {
                espacioUtilizadoDiscoDuro -= espacioEliminado;
                System.out.println("Archivos eliminados con éxito, se eliminaron " + espacioEliminado + "GB");
            }
            System.out.println("Espacio en disco duro restante: " + (capacidadDiscoDuro + espacioEliminado) + "GB");
        }
        return espacioEliminado;

    }

    public boolean isIgual(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Ordenador otroOrdenador = (Ordenador) obj;
        return marca.equals(otroOrdenador.marca) && modelo.equals(otroOrdenador.modelo);
    }

    public static void validarOrdenador(Ordenador ordenador1, Ordenador ordenador2) {
        if (ordenador1.isIgual(ordenador2)) {
            System.out.println("\nLos ordenadores son iguales ✔️");
        } else {
            System.out.println("\nLos ordenadores no son iguales ✖️");
        }
    }


    @Override
    public String toString() {
        return "Ordenador{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", gbRam=" + gbRam +
                ", capacidadDiscoDuro=" + capacidadDiscoDuro +
                ", espacioUtilizadoDiscoDuro=" + espacioUtilizadoDiscoDuro +
                ", isEncendido=" + isEncendido +
                '}';
    }
}
