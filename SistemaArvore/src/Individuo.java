import java.util.ArrayList;

public class Individuo implements Sistema{
    String nome;
    String email;
    String senha;

    public Individuo(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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
