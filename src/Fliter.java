import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Fliter {
    public static void main(String[] args) {

        aluno a1 = new aluno("Petronio",1.7);
        aluno a2 = new aluno("MArcelo",7.1);
        aluno a3 = new aluno("Ronald",9.8);
        aluno a4 = new aluno("Clara",8.9);
        aluno a5 = new aluno("Larissa",4.6);
        aluno a6 = new aluno("Matheus",5.1);
        aluno a7 = new aluno("João",1.5);

        List<aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);

        alunos.stream().filter(a -> a.nota >= 7).map(a -> "Parabéns  " + a.nome + "! Você passou!" ).forEach(System.out::println);



    }
}
