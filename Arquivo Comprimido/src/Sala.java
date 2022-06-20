
import java.util.List;

public class Sala {
    private String nome;
    private int numeroAcentos;
    private List<Horario> horarios;

    public Sala(String nome, int numeroAcentos, List<Horario> horarios) {
        this.nome = nome;
        this.numeroAcentos = numeroAcentos;
        this.horarios = horarios;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public int getNumeroAcentos() {
        return numeroAcentos;
    }

    public String getNome() {
        return nome;
    }
}
