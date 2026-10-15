package Tecnologias;
import Cursos.Cursos;

public class Tecnologias implements ContabilizarHoras{
    String nome;
    int duracaoEmHoras = 0;
    String nivel = "Iniciante";

    public Tecnologias(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public int getHoras() {
        return duracaoEmHoras;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" Horas estudadas: "+duracaoEmHoras+" Nível: "+nivel;
    }

    @Override
    public int AdicionarHoras(Cursos curso) {
        if (curso.getStatus().equalsIgnoreCase("concluído")) {
            return duracaoEmHoras += curso.getDuracaoEmHoras();
        }
        return 0;
    }
}
