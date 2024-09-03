public class Cuadrado extends Figura {

    private  double lado;

    public Cuadrado(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
