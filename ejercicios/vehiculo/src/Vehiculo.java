public abstract class Vehiculo {
    private String marca;
    private String color;
    private int numeroRuedas;
    private int numeroPuertas;
    private int cilindraje;
    private String modelo;

    public abstract String acelerar();

    public abstract String frenar();

    public abstract String pitar();

    public Vehiculo() {
    }

    public Vehiculo(String marca, String color, int numeroRuedas, int numeroPuertas, int cilindraje, String modelo) {
        this.marca = marca;
        this.color = color;
        this.numeroRuedas = numeroRuedas;
        this.numeroPuertas = numeroPuertas;
        this.cilindraje = cilindraje;
        this.modelo = modelo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeroRuedas=" + numeroRuedas +
                ", numeroPuertas=" + numeroPuertas +
                ", cilindraje=" + cilindraje +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
