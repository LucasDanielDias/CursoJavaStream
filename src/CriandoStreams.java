import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        //criando uma referencia de metodo
        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("java ","Pyhton ","lua ",".NET\n");//primeira forma de criar uma stream com o metodo estatico of
        langs.forEach(print);

        String[] maislangs = {"C ","C++ ", "Pearl ", "Go\n"};
        Stream.of(maislangs).forEach(print);//criando uma stream a partir de um array
        Arrays.stream(maislangs).forEach(print);//criando uma stream direto pela interfaçe arrays
        Arrays.stream(maislangs, 1, 2).forEach(print);//podendo escolher o inicil e o fim

        List<String> outrasLangs = Arrays.asList("PHP", "Kotlin, godoth, CSS");
        outrasLangs.stream().forEach(print);
        outrasLangs.parallelStream().forEach(print);//cria uma thread nova

        
    }
}
