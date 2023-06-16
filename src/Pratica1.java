import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Pratica1 {
    public static void main(String[] args) {
        Integer y = 0;

        aluno a1 =  new aluno("Matheus", 5.9);
        aluno a2 = new aluno("Josivan", 4.8);
        aluno a3 = new aluno("Pedro",7.5);
        aluno a4 = new aluno("Gionane", 8.9);
        aluno a5 = new aluno("Paragauio", 10.0);
        aluno a6 = new aluno("João", 6.5);
        aluno a7 = new aluno("Caio", 2.3);
        aluno a8 = new aluno("Gabi", 1.8);
        aluno a9 = new aluno("Sabrina", 3.0);
        aluno a10 = new aluno("Rafaela",4.2);
        aluno a11 = new aluno("Robert",9.6);
        aluno a12 = new aluno("Leo",9.6);
        aluno a13 = new aluno("Carmem",3.0);
        aluno a14 = new aluno("Igor",4.8);
        aluno a15 = new aluno("Gustavo",5.1);

        List<aluno> sala = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15);

        Function<aluno,Double> notas = x -> x.nota;

        Function<Double,Boolean> aprovados = x -> x >= 6.0;




    }
}
