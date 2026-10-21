package Projetos;

import Tecnologias.Tecnologia;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    String nome;
    String descricao;
    List<String> tecnologias = new ArrayList<>();
    String status;

    public Projeto(String nome, String descricao, Tecnologia tecnologia, String status){
        this.nome=nome;
        this.descricao=descricao;
        tecnologias.add(tecnologia.getNome());
        this.status=status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\nDescrição: "+descricao+"\nTecnologias: "+String.join(", ", tecnologias)+"\nStatus: "+status;
    }
}
