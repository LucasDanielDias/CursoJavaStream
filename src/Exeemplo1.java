import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Exeemplo1 {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu","Gui","Luca","Ana");
        String complemento = " foi aprovado! ";
        //for normal
        for (int i = 0; i < aprovados.size(); i++){
            System.out.println(aprovados.get(i)+ " Foi aprovado/a");
        }
        //pulando a linha
        System.out.println("\n");

        //foreach padrão
        for (String nome : aprovados){
            System.out.println(nome + complemento);
        }
        System.out.println("\n");

        // usando um um iterator
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n");

        //usando stream
        Stream<String> st = aprovados.stream();
        //Atentar na pontuação
        st.forEach(System.out::println);//laço interno
    }
}
