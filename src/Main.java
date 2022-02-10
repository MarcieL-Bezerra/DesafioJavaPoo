import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8+8);

        mentoria.setTitulo("Metoria Java");
        mentoria.setDescricao("descricao metoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(mentoria);
    }
}
