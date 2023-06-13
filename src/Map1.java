import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map1 {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        List<String> marcas = Arrays.asList("BMW","Audi","Honda");
        marcas.stream().map(m-> m.toLowerCase()).forEach(print);
        UnaryOperator<String> maiuscula = m -> m.toUpperCase();
        UnaryOperator<String> primeiraLetra = m -> m.charAt(0)+"";
        UnaryOperator<String>grito = m -> m+"!!!";
       marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print);



    }
}
