public class Arvore {
    String especie;
    String localizacao;
    Status estadoSaude;
    Adubo adubo;
    String tipoIrrigacao;

    public Arvore(String especie, String localizacao, Status estadoSaude, Adubo adubo, String tipoIrrigacao) {
        this.especie = especie;
        this.localizacao = localizacao;
        this.estadoSaude = estadoSaude;
        this.adubo = adubo;
        this.tipoIrrigacao = tipoIrrigacao;
    }
}
