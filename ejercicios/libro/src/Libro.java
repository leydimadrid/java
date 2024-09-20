public class Libro {
    private String autor;
    private String titulo;
    private String isbn;
    private int numeroPaginas;
    private boolean isPrestado;


    public Libro() {
    }

    public Libro(String autor, String titulo, String isbn, int numeroPaginas, boolean isPrestado) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.isPrestado = isPrestado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public boolean isPrestado() {
        return isPrestado;
    }

    public void setPrestado(boolean isPrestado) {
        isPrestado = isPrestado;
    }

    public String prestar() {
        if (isPrestado) {
            System.out.println("\n📘El libro " + isbn + " con título " + titulo + " y autor " + autor + " tiene " + numeroPaginas + " páginas y está prestado");
        } else {
            System.out.println("\n📘El libro " + isbn + " con título " + titulo + " y autor " + autor + " tiene " + numeroPaginas + " páginas y no está prestado");
        }

        return "";
    }

    public String devolver() {
        if (isPrestado) {
            System.out.println("\n📘El libro " + isbn + " con título " + titulo + " y autor" + autor + " tiene " + numeroPaginas + " páginas y está prestado");
        } else {
            System.out.println("\n📘El libro " + isbn + " con título " + titulo + " y autor" + autor + " tiene " + numeroPaginas + " páginas, no está prestado");
        }
        return "";
    }

    ;

    public void imprimir() {
        int impresionPorPagina = 200;
        double total = impresionPorPagina * numeroPaginas;
        double numeroDividido = total / 1000;
        String numeroFormateado = String.format("%.3f", numeroDividido);
        System.out.println("🟣El total de la impresión de " + numeroPaginas + " páginas es: " + "$" + numeroFormateado + " pesos");
    }

    public boolean isIgual(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Libro otroLibro = (Libro) obj;
        return isbn.equals(otroLibro.isbn);
    }

    public static void validarIsbn(Libro libro1, Libro libro2) {
        if (libro1.isIgual(libro2)) {
            System.out.println("Las libros son iguales");
        } else {
            System.out.println("Las libros son diferentes");
        }

    }


    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", isbn=" + isbn +
                ", numeroPaginas=" + numeroPaginas +
                ", isPrestado=" + isPrestado +
                '}';
    }
}
