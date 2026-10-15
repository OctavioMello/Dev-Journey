import Cursos.Cursos;
import Tecnologias.Tecnologias;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tecnologias java = new Tecnologias("Java");
        Tecnologias python = new Tecnologias("Python");

        List<Tecnologias> listaLinguagens = new ArrayList<Tecnologias>();

        listaLinguagens.add(java);
        listaLinguagens.add(python);

        for (Tecnologias linguagem:listaLinguagens){
            System.out.println(linguagem);
        }

        Cursos javaBasico = new Cursos("Java Básico", "Alura", java, "concluído", 10);

        java.AdicionarHoras(javaBasico);

        for (Tecnologias linguagem:listaLinguagens){
            System.out.println(linguagem);
        }
    }
}
