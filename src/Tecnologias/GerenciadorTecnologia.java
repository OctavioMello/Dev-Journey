package Tecnologias;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTecnologia {
    List<Tecnologia> listaTecnologias = new ArrayList<>();

    public void registrarTecnologia(String nome){
        listaTecnologias.add(new Tecnologia(nome));
        System.out.println("Tecnologia cadastrada!");
    }

    public void listarTecnologias(){
        if (listaTecnologias.isEmpty()){
            System.out.println("Não há tecnologias cadastradas!");
            return;
        }
        System.out.println("Tecnologias cadastradas:");
        for (Tecnologia tecnologias:listaTecnologias){
            System.out.println();
            System.out.println(tecnologias);
        }
    }
}