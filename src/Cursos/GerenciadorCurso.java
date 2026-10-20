package Cursos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorCurso{
    List<Curso> listaCursos = new ArrayList<Curso>();

    public void registrarCurso(String nome, String plataforma, String tecnologia, String status, int duracaoEmHoras){
        listaCursos.add(new Curso(nome, plataforma, tecnologia, status, duracaoEmHoras));
    }

    public void listarCursos(){
        for (Curso cursos:listaCursos){
            System.out.println();
            System.out.println(cursos);
        }
    }

    public void atualizarStatus(Curso curso, String novoStatus){
        curso.setStatus(novoStatus);
    }
}
