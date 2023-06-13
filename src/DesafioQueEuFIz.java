import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioQueEuFIz {
    public static void main(String[] args) {
        Conta c1 = new Conta("Ronaldo",1000.0,5065.2);
        Conta c2 = new Conta("João",10000.0,7500.0);
        Conta c3 = new Conta("Caguelson",150.0,102.0);
        Conta c4 = new Conta("Marrocos",1580.0,1600.0);
        Conta c5 = new Conta("Gemarius",750.0,750.0);
        Conta c6 = new Conta("Billeam",58000.0,69000.0);
        Conta c7 = new Conta("Cornelhos",45000.0,150000.0);
        Conta c8 = new Conta("Quened",15000.0,6000.0);
        Conta c9 = new Conta("Leozin",7800.0,9500.0);
        Conta c10 = new Conta("Rafaela",4500.0,3000.0);
        Conta c11 = new Conta("Edvan",600000.0,30000.0);


        List<Conta> ac = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11);
        ac.stream().filter(conta -> conta.limite >= 10000.0).filter(conta -> conta.saldo >=20000.0).map(a -> "Parabéns  " + a.nome + "! Você passou na nossa malha fina. Gostaria de investir em aditivos?").forEach(System.out::println);
    }
}
