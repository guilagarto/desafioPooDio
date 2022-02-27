import br.dioJava.Curso;
import br.dioJava.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        //intanciando as classes
        // a classe é a planta da casa o objeto é a casa construída
        Curso curso1 = new Curso();
        // metodo set atribui o valor
        curso1.setTitulo("Curso JAva");
        curso1.setDescricao("Curso JAva");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso HTML");
        curso2.setDescricao("curso HTML");
        curso2.setCargaHoraria(80);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("deixa de ser burro");
        mentoria.setDescricao("presta atenção");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }

}
