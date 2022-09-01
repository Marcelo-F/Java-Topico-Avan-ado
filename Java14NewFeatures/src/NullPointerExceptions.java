class Aluno {
    private String nome = null;

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class NullPointerExceptions {
    public static void main(String[] args) {
        // No java 14, os logs mostra com mais detalhes e precisão de onde esta ocorrendo a exceção.
        Aluno a  = new Aluno();

        a.getNome().substring(0,1);
    }
}
