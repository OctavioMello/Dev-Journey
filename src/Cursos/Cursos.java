package Cursos;

import Tecnologias.Tecnologias;

public class Cursos {
    String nome;
    String plataforma;
    Tecnologias tecnologia;
    String status;
    int duracaoEmHoras;

    public Cursos(String nome, String plataforma, Tecnologias tecnologia, String status, int duracaoEmHoras){
        this.nome=nome;
        this.plataforma=plataforma;
        this.tecnologia=tecnologia;
        this.status=status;
        this.duracaoEmHoras=duracaoEmHoras;
    }

    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public Tecnologias getTecnologia() {
        return tecnologia;
    }

    public String getStatus() {
        return status;
    }

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    public void atualizarStatus(String novoStatus){
        this.status=novoStatus;
    }
}
