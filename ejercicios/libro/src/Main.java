public class Main {
    public static void main(String[] args) {
        Libro matematicas = new Matematicas("'Harper Lee'", "'To Kill a Mockingbird'", "9780446310789", 290, true);
        System.out.println(matematicas);
        matematicas.prestar();
        matematicas.imprimir();
        Libro javaScript = new JavaScript("'Jane Smith'", "'JavaScript: The Definitive Guide'", "9780446310789", 864, false);
        System.out.println(javaScript);
        javaScript.prestar();
        javaScript.imprimir();

        Libro.validarIsbn(matematicas, javaScript);
    }

}