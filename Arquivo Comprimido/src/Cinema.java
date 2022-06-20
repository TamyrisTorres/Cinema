
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cinema {
    private String nome;
    private List<Filme> filmes = new ArrayList<Filme>();

    public Cinema(String nome) {
        this.nome = nome;
        abrirCinema();
    }
    
    public String getNome() {
        return nome;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    private void abrirCinema() {
        List<String> funcoes = Arrays.asList("caixa","balas","lanterninha","bilheteiro");

        Funcionario funcionario1 = new Funcionario("Fulano", funcoes.get(0), "111", LocalDate.of(2022, 06, 01), 2000);
        Funcionario funcionario2 = new Funcionario("Beltrano", funcoes.get(1), "222", LocalDate.of(2022, 06, 01), 2000);
        Funcionario funcionario3 = new Funcionario("Cicrano", funcoes.get(2), "333", LocalDate.of(2022, 06, 01), 2000);
        Funcionario funcionario4 = new Funcionario("Loiano", funcoes.get(3), "444", LocalDate.of(2022, 06, 01), 2000);

        //===== horarios =====
            Horario horario16 = new Horario(
                LocalTime.of(16, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
            Horario horario17 = new Horario(
                LocalTime.of(17, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
            Horario horario18 = new Horario(
                LocalTime.of(18, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
            Horario horario19 = new Horario(
                LocalTime.of(19, 30), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );

            //------ rodizio de funcoes -----
                Collections.shuffle(funcoes);
                funcionario1.setFuncao(funcoes.get(0));
                funcionario2.setFuncao(funcoes.get(1));
                funcionario3.setFuncao(funcoes.get(2));
                funcionario4.setFuncao(funcoes.get(3));
            //------ fim rodizio de funcoes -----

            Horario horario20 = new Horario(
                LocalTime.of(20, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
            Horario horario22 = new Horario(
                LocalTime.of(22, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
            Horario horario24 = new Horario(
                LocalTime.of(00, 00), 
                Arrays.asList(funcionario1, funcionario2, funcionario3, funcionario4)
            );
        //===== fim horarios =====

        //===== salas =====
            Sala sala1 = new Sala(
                "Sala 1", 
                10, 
                Arrays.asList(horario16, horario17, horario18, horario19, horario20, horario22, horario24)
            );
            Sala sala2 = new Sala(
                "Sala 2", 
                10, 
                Arrays.asList(horario16, horario17)
            );
            Sala sala3 = new Sala(
                "Sala 3", 
                10, 
                Arrays.asList(horario18, horario19, horario20, horario22, horario24)
            );
            Sala sala4 = new Sala(
                "Sala 4", 
                10, 
                Arrays.asList(horario22, horario24)
            );
        //===== fim salas =====

        //===== filmes =====
            Filme filme1 = new Filme(
                true, 
                Arrays.asList(sala1, sala2, sala3), 
                "Filme de teste 1", 
                "Filme de teste 1", 
                "Diretor de teste", 
                2022, 
                "Ação", 
                "Esta é uma descrição resumida de teste sobre o filme em questão", 
                "Indicado para melhor filme de 2022");
            
            Filme filme2 = new Filme(
                true, 
                Arrays.asList(sala3, sala4), 
                "Filme de teste 2", 
                "Filme de teste 2", 
                "Diretor de teste", 
                2022, 
                "Ação", 
                "Esta é uma descrição resumida de teste sobre o filme em questão", 
                "Indicado para melhor filme de 2022");
            
            Filme filme3 = new Filme(
                true, 
                Arrays.asList(sala1, sala2, sala3, sala4), 
                "Filme de teste 3", 
                "Filme de teste 3", 
                "Diretor de teste", 
                2022, 
                "Ação", 
                "Esta é uma descrição resumida de teste sobre o filme em questão", 
                "Indicado para melhor filme de 2022");
        //===== fim filmes =====

        if(checkFilmeExiste(filme1)) this.filmes.add(filme1);
        if(checkFilmeExiste(filme2)) this.filmes.add(filme2);
        if(checkFilmeExiste(filme3)) this.filmes.add(filme3);
    }

    private Boolean checkFilmeExiste(Filme filme) {
        Boolean retorno = true;
        if(this.filmes.size() == 0) {
            return true;
        }
        for (int i = 0; i < this.filmes.size(); i++) {
            if(this.filmes.get(i).getNomePt().equals(filme.getNomePt()) && 
                this.filmes.get(i).getAnoLancamento() == filme.getAnoLancamento()) {
                retorno = false;
            }
        }
        return retorno;
    }
}
