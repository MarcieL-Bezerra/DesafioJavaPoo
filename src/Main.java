import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();
        Bootcamp bootcamp = new Bootcamp();
        Dev dev = new Dev();
        Dev dev2 = new Dev();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("Metoria Java");
        mentoria.setDescricao("descricao metoria java");
        mentoria.setData(LocalDate.now());


        /**System.out.println(curso1);
        System.out.println(mentoria);*/
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("----------");
        dev.setNome("Marciel");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos Inscritos após: " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev.getConteuddosConcluidos());
        System.out.println("XP: " + dev.calcularTotalXp());

        System.out.println("------------");
        dev2.setNome("camila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Inscritos após: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev2.getConteuddosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
