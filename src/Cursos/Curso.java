package Cursos;

import Tecnologias.Tecnologia;

public class Curso {
    String nome;
    String plataforma;
    String tecnologia;
    String status;
    int duracaoEmHoras;

    public Curso(String nome, String plataforma, String tecnologia, String status, int duracaoEmHoras){
        this.nome=nome;
        this.plataforma=plataforma;
        this.tecnologia=tecnologia;
        this.status=status;
        this.duracaoEmHoras=duracaoEmHoras;
    }

    public void setStatus(String status){
        this.status=status;
    }

    public String getStatus() {
        return status;
    }

    public int getDuracaoEmHoras() {
        return duracaoEmHoras;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nPlataforma: "+plataforma+"\nTecnologias: "+tecnologia+"\nStatus: "+status+"\nDuração: "+duracaoEmHoras+"horas";
    }
}
