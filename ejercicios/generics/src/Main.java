import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     Generico <Double> generico = new Generico<>(1.0);
     generico.mostrar("1");

     Generico<Integer> generico1 = new Generico<>(1);
     generico1.mostrar("Hola");
    }
}