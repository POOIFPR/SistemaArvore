import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore("Ipê-amarelo",
                "Bairro Colorido",
                Status.ENFRAQUECIDA,
                new Adubo("Adubox",
                        "TopLimpezas",
                        "14/07/2025"),
                "Irrigação diária, necessita de bastante água");

        Individuo individuo = new Individuo("Célio",
                "celinho@email.com",
                "celiocelio14563");

        Organizacao organizacao = new Organizacao("Indemil",
                "indemil@mandioca.com",
                "mandioquinha456",
                individuo);

        ArrayList<Arvore> arvores = new ArrayList<>();
        ArrayList<Individuo> individuos = new ArrayList<>();

        Evento evento = new Evento(Optional.of(individuos),
                Optional.of(arvores),
                "25/07/2024",
                "08h30");
    }
}