package Tecnologias;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTecnologia {
    List<Tecnologia> listaTecnologias = new ArrayList<Tecnologia>();

    public void registrarTecnologia(String nome){
        listaTecnologias.add(new Tecnologia(nome)) ;
    }

    public void listarTecnologias(){
        for (Tecnologia tecnologias:listaTecnologias){
            System.out.println();
            System.out.println(tecnologias);
        }
    }
}
