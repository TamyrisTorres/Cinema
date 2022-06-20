import java.util.List;

public class Filme {
    private Boolean estaEmCartaz;
    private List<Sala> salas;
    private String nomePt;
    private String nomeNaLinguaOriginal;
    private String diretor;
    private int anoLancamento;
    private String tipo;
    private String sinopse;
    private String premiacoes;

    public Filme(
        Boolean estaEmCartaz,
        List<Sala> salas,
        String nomePt,
        String nomeNaLinguaOriginal,
        String diretor,
        int anoLancamento,
        String tipo,
        String sinopse,
        String premiacoes
    ) {
        this.estaEmCartaz = estaEmCartaz;
        this.salas = salas;
        this.nomePt = nomePt;
        this.nomeNaLinguaOriginal = nomeNaLinguaOriginal;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.tipo = tipo;
        this.sinopse = sinopse;
        this.premiacoes = premiacoes;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getTipo() {
        return tipo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getNomeNaLinguaOriginal() {
        return nomeNaLinguaOriginal;
    }

    public String getNomePt() {
        return nomePt;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public Boolean getEstaEmCartaz() {
        return estaEmCartaz;
    }
}
