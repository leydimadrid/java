public class Main {
    public static void main(String[] args) {

        BaseDeDatos db = new BaseDeDatos();
        Persona persona1 = new Persona("Leydi Johana", "Madrid Vásquez", 27, "Mujer", "Cedula", 1152464658, "Leydi.madrid6@gmail.com", 3218420450L, "Cll 58#21");
        Persona persona2 = new Persona("Juan Carlos", "Madrid", 29, "Hombre", "Cedula", 1152464658, "juanmv6@gmail.com", 3026596398L, "Cll 30#21");
        Persona persona3 = new Persona("Perla", "Suarez", 20, "Mujer", "Cedula", 1152458987, "perla@gmail.com", 3012596398L, "Cll 27#21");

        db.create(persona1);
        db.create(persona2);
        db.create(persona3);
        db.read();

        Persona persona1Actualizar = new Persona("Vanessa", "Madrid Vásquez", 27, "Mujer", "Cedula", 1152464658, "Leydi.madrid6@gmail.com", 3218420450L, "Cll 58#21");
        db.update(persona1Actualizar);
        db.read();
        db.delete(persona1);
        db.read();

    }
}