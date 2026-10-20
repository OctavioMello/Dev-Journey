package Tecnologias;
import Cursos.Curso;

public class Tecnologia implements ContabilizarHoras{
    String nome;
    int horasEstudadas = 0;
    String nivel = "Iniciante";
    String status = "Ativo";

    public Tecnologia(String nome){
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public int getHoras() {
        return horasEstudadas;
    }

    public String getNivel() {
        return nivel;
    }

    public String getStatus(){
        return status;
    }

    public void alterarStatus(String novoStatus){
        this.status=novoStatus;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nHoras estudadas: "+horasEstudadas+"\nNível: "+nivel;
    }

    @Override
    public int AdicionarHoras(Curso curso) {
        if (curso.getStatus().equalsIgnoreCase("concluído")) {
            return horasEstudadas += curso.getDuracaoEmHoras();
        }
        return 0;
    }


}
