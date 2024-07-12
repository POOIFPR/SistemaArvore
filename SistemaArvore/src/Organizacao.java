import java.util.ArrayList;

public class Organizacao implements Sistema{
    String nome;
    String email;
    String senha;
    Individuo CEO;

    public Organizacao(String nome, String email, String senha, Individuo CEO) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.CEO = CEO;
    }

    @Override
    public Arvore reservarArvore() {
        return null;
    }

    @Override
    public Arvore visualizarArvore() {
        return null;
    }

    @Override
    public ArrayList<Arvore> visualizarArvores() {
        return null;
    }

    @Override
    public void registrarAtividadesManutencao() {

    }
}
