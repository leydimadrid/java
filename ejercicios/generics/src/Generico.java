public class Generico <T extends Number>{
    private final T  tipoObjeto;

    public Generico(T tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public <T> void mostrar( T tipoObjeto){
        System.out.println("Esta es la clase del generico: " + tipoObjeto.getClass().getName());
    }
}
