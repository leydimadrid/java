import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    List<Persona> personas = new ArrayList<>();

    public void create(Persona persona) {
        personas.add(persona);
        System.out.println("----------------------");
        System.out.println("\n¡Persona agregada con éxito! ✔️");
    }


    public void read() {
        System.out.println("\nHay " + personas.size() + " personas en la base de datos🖥️ \n");
        for (Persona p : personas) {
            System.out.println("Nombres: " + p.getNombres());
            System.out.println("Apellidos: " + p.getApellidos());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("Género: " + p.getGenero());
            System.out.println("Tipo DNI: " + p.getTipoDni());
            System.out.println("Dni: " + p.getDni());
            System.out.println("Email: " + p.getEmail());
            System.out.println("Celular: " + p.getCelular());
            System.out.println("Dirección: " + p.getDireccion());
            System.out.println("-----------------------------");
        }
    }

    public void update(Persona persona) {
        for (Persona p : this.personas) {
            if (p.getDni() == persona.getDni()) {
                p.setNombres(persona.getNombres());
                p.setApellidos(persona.getApellidos());
                p.setEdad(persona.getEdad());
                p.setGenero(persona.getGenero());
                p.setTipoDni(persona.getTipoDni());
                p.setDni(persona.getDni());
                p.setEmail(persona.getEmail());
                p.setCelular(persona.getCelular());
                p.setDireccion(persona.getDireccion());
                System.out.println("Persona actualizada con éxito 🔄️");
                return;
            }
            System.out.println("Persona no encontrada ✖️");
        }

    }

    public void delete(Persona persona) {
        this.personas.remove(persona);
        System.out.println("La persona con DNI: " + persona.getDni() + " ha sido eliminada ✖️");
    }
}
