public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("B12345678", "Empresa de tecnología");
        Empleado empleado1 = new Empleado(1152467896, "Leydi Madrid", 31, true, Departamento.DIRECCION, empresa);
        Empleado empleado2 = new Empleado(1152467896, "Johana Álvarez", 27, false, Departamento.CONTABILIDAD, empresa);
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println("\n💵 El sueldo de " + empleado1.getNombre() + " es: " + empleado1.calcularSueldo() + "€");
        System.out.println("💵 El sueldo de " + empleado2.getNombre() + " es: " + empleado2.calcularSueldo() + "€");
        Empleado.validarCedula(empleado1, empleado2);


    }
}