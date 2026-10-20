package Projetos;

import Tecnologias.Tecnologia;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProjeto {
    List<Projeto> listaProjetos = new ArrayList<>();

    public void registrarProjeto(String nome, String descricao, Tecnologia tecnologia, String status){
        listaProjetos.add(new Projeto(nome, descricao, tecnologia, status));
        System.out.println("Projeto cadastrado!");
    }

    public void listarProjetos(){
        if (listaProjetos.isEmpty()){
            System.out.println("Não há projetos cadastrados!");
            return;
        }
        System.out.println("Projetos cadastrados!");
        for (Projeto projeto : listaProjetos){
            System.out.println();
            System.out.println(projeto);
        }
    }

    public void atualizarStatus(Projeto projeto, String status){
        projeto.setStatus(status);
        System.out.println("Status atualizado!");
    }

    public void adicionarTecnologia(Projeto projeto, Tecnologia tecnologia){
        projeto.tecnologias.add(tecnologia);
    }
}
