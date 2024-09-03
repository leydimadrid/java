public class Moto extends Vehiculo {
    public Moto(String marca, String color, int numeroRuedas, int numeroPuertas, int cilindraje, String modelo) {
        super(marca, color, numeroRuedas, numeroPuertas, cilindraje, modelo);
    }

    @Override
    public String acelerar() {
        return "La SZRR está acelerando 🏍️";
    }

    @Override
    public String frenar() {
        return "La SZRR está frenando 🏍️";

    }

    @Override
    public String pitar() {
        return "La SZRR está pitando 🏍️";
    }
}
