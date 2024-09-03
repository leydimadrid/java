public class Carro extends Vehiculo {

    public Carro(String marca, String color, int numeroRuedas, int numeroPuertas, int cilindraje, String modelo) {
        super(marca, color, numeroRuedas, numeroPuertas, cilindraje, modelo);
    }

    @Override
    public String acelerar() {
        return "El mazda 3 está acelerando 🚗";
    }

    @Override
    public String frenar() {
        return "El mazda 3 está frenando 🚗";
    }

    @Override
    public String pitar() {
        return "El mazda 3 está pitando 🚗";
    }
}
