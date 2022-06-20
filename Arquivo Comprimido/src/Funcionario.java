import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String funcao;
    private String numeroCarteira;
    private LocalDate dataAdmissao;
    private double salario;
    
    public Funcionario(String nome, String funcao, String numeroCarteira, LocalDate dataAdmissao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.numeroCarteira = numeroCarteira;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public String getNumeroCarteira() {
        return numeroCarteira;
    }
    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }
    public double getSalario() {
        return salario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
