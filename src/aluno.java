import java.util.Objects;

public class aluno {
    final String nome;
    final double nota;

    public aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        aluno aluno = (aluno) o;
        return Double.compare(aluno.nota, nota) == 0 && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota);
    }
}
