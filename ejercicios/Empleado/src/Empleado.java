public class Empleado {
    private static final int SALARIO_BASE = 1500;

    private int cedula;
    private String nombre;
    private int edad;
    private boolean teletrabajo;
    private Departamento departamento;
    private Empresa empresa;

    public Empleado(int cedula, String nombre, int edad, boolean teletrabajo, Departamento departamento, Empresa empresa) {
        super();
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.teletrabajo = teletrabajo;
        this.departamento = departamento;
        this.empresa = empresa;
    }


    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isTeletrabajo() {
        return teletrabajo;
    }

    public void setTeletrabajo(boolean teletrabajo) {
        this.teletrabajo = teletrabajo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public double calcularSueldo() {
        double sueldo = SALARIO_BASE;

        if (edad > 30) {
            sueldo += 200;
        }

        if (teletrabajo == true) {
            sueldo += 30;
        }

        switch (departamento) {
            case CONTABILIDAD:
                sueldo += 50;
                break;
            case INFORMATICA:
                sueldo += 80;
                break;
            case DIRECCION:
                sueldo += 100;
                break;

        }
        return sueldo;
    }


    public boolean isIgual(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Empleado otroEmpleado = (Empleado) obj;
        return cedula == otroEmpleado.cedula;
    }

    public static void validarCedula(Empleado empleado1, Empleado empleado2) {
        if (empleado1.isIgual(empleado2)) {
            System.out.println("\nLas cédulas son iguales ✖️");
        } else {
            System.out.println("\nLas cédulas son diferentes ✔️");
        }

    }

    @Override
    public String toString() {
        return "\nEmpleado {" +
                "cedula=" + cedula +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", teletrabajo=" + teletrabajo +
                ", departamento=" + departamento +
                ", empresa=" + empresa.getNombre() +
                ", cif=" + empresa.getCif() +
                '}';
    }
}
