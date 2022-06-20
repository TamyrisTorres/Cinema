import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cinema cinema = new Cinema("Cinema de teste");

        System.out.println("===================================");
        System.out.println("Olá visitante, seja bem-vindo ao "+cinema.getNome()+".");
        System.out.println("===================================");
        System.out.println("");
        System.out.println("======== Filmes em cartaz ===========");
        System.out.println("");
        System.out.println("----------------------------");
        for (int i = 0; i < cinema.getFilmes().size(); i++) {
            Filme filme = cinema.getFilmes().get(i);
            if(filme.getEstaEmCartaz()) {
                System.out.println("|("+i+") - "+filme.getNomePt());
                
                for (int j = 0; j < filme.getSalas().size(); j++) {
                    Sala sala = filme.getSalas().get(j);
                    System.out.println("|     ["+sala.getNome()+"]");
                    
                    List<String> horariosString = new ArrayList<String>();
                    for (int k = 0; k < sala.getHorarios().size(); k++) {
                        LocalTime horario = sala.getHorarios().get(k).getHorario();
                        String hora = horario.getHour() <= 9 ? "0"+horario.getHour() : Integer.toString(horario.getHour());
                        String minutos = horario.getMinute() <= 9 ? "0"+horario.getMinute() : Integer.toString(horario.getMinute());
                        horariosString.add("["+hora+":"+minutos+"]");
                    }
                    System.out.println("|         Horários: "+String.join(", ", horariosString));
                }
                System.out.println("----------------------------");
            }
        }
        
        System.out.println("Gostaria de saber mais sobre algum dos filmes assima?");
        System.out.println("Digite 1 para sim e 2 para não.");

        Scanner s1 = new Scanner(System.in);

        if(!s1.hasNextInt()) {
            System.out.println("Você digitou uma opção inválida! Tente novamente.");
        } else {
            int opcao = s1.nextInt();
            if(opcao == 2) {
                System.out.println("Ok, até mais...");
            } else {
                System.out.println("Digite o número correspondente ao filme:");
                Scanner s2 = new Scanner(System.in);
                if(!s2.hasNextInt()) {
                    System.out.println("A opção que você digitou não existe! Tente novamente.");
                } else {
                    int indexFilme = s2.nextInt();
                    if (indexFilme > cinema.getFilmes().size() || indexFilme < 0 ){
                        System.out.println("A opção que você digitou não existe! Tente novamente.");
                    } else {
                        Filme filmeSelecionado = cinema.getFilmes().get(indexFilme);
                        System.out.println("");
                        System.out.println("");
                        System.out.println("----------- "+filmeSelecionado.getNomePt()+" -----------------");
                        System.out.println("|Diretor: "+filmeSelecionado.getDiretor());
                        System.out.println("|Ano de lançamento: "+filmeSelecionado.getAnoLancamento());
                        System.out.println("|Tipo: "+filmeSelecionado.getTipo());
                        System.out.println("|Sinopse: "+filmeSelecionado.getSinopse());
                        System.out.println("|Premiações: "+filmeSelecionado.getPremiacoes());
                        System.out.println("|");

                        for (int j = 0; j < filmeSelecionado.getSalas().size(); j++) {
                            Sala sala = filmeSelecionado.getSalas().get(j);
                            System.out.println("|- "+sala.getNome()+"");
                            
                            List<String> horariosString = new ArrayList<String>();
                            for (int k = 0; k < sala.getHorarios().size(); k++) {
                                LocalTime horario = sala.getHorarios().get(k).getHorario();
                                String hora = horario.getHour() <= 9 ? "0"+horario.getHour() : Integer.toString(horario.getHour());
                                String minutos = horario.getMinute() <= 9 ? "0"+horario.getMinute() : Integer.toString(horario.getMinute());
                                horariosString.add("["+hora+":"+minutos+"]");
                            }
                            System.out.println("|    Horários: "+String.join(", ", horariosString));
                        }
                        System.out.println("---------------------------------");
                    }
                }
                s2.close();
            }
        }
        s1.close();
    }
}
