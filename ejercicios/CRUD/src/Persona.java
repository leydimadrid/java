public class Persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private String genero;
    private String tipoDni;
    private int dni;
    private String email;
    private long celular;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombres, String apellidos, int edad, String genero, String tipoDni, int dni, String email, long celular, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
        this.tipoDni = tipoDni;
        this.dni = dni;
        this.email = email;
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipoDni() {
        return tipoDni;
    }

    public void setTipoDni(String tipoDni) {
        this.tipoDni = tipoDni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", tipoDni='" + tipoDni + '\'' +
                ", dni=" + dni +
                ", email='" + email + '\'' +
                ", celular=" + celular +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
