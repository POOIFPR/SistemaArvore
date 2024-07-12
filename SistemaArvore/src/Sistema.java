import java.util.ArrayList;

public interface Sistema {
    Arvore reservarArvore();

    Arvore visualizarArvore();

    ArrayList<Arvore> visualizarArvores();

    void registrarAtividadesManutencao();
}
