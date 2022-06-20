import java.time.LocalTime;
import java.util.List;

public class Horario {
    private LocalTime horario;
    private List<Funcionario> funcionarios;

    public Horario(LocalTime horario, List<Funcionario> funcionarios) {
        this.horario = horario;
        this.funcionarios = funcionarios;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public LocalTime getHorario() {
        return horario;
    }
}
