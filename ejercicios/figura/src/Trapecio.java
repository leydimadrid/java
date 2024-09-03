public class Trapecio extends Figura {
    private double base_mayor;
    private double base_menor;
    private double altura;

    @Override
    public double calcularArea() {
        return (base_mayor + base_menor) / 2 * altura;
    }

    public Trapecio(String nombre, String color, double base_mayor, double base_menor, double altura) {
        super(nombre, color);
        this.base_mayor = base_mayor;
        this.base_menor = base_menor;
        this.altura = altura;
    }

    public double getBase_mayor() {
        return base_mayor;
    }

    public void setBase_mayor(double base_mayor) {
        this.base_mayor = base_mayor;
    }

    public double getBase_menor() {
        return base_menor;
    }

    public void setBase_menor(double base_menor) {
        this.base_menor = base_menor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


}
