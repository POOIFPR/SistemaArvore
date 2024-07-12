import java.util.ArrayList;
import java.util.Optional;

public class Evento {
    Optional<ArrayList<Individuo>> convidados;
    Optional<ArrayList<Arvore>> arvores;
    String dataEvento;
    String horario;

    public Evento(Optional<ArrayList<Individuo>> convidados, Optional<ArrayList<Arvore>> arvores, String dataEvento, String horario) {
        this.convidados = convidados;
        this.arvores = arvores;
        this.dataEvento = dataEvento;
        this.horario = horario;
    }
}
