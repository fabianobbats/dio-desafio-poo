import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso("Java", "Curso Java", 30);
        System.out.println(curso1);

        Conteudo curso2 = new Curso("Typescript", "Curso Typescipt", 25);
        System.out.println(curso2);

        Conteudo mentoria1 = new Mentoria("Mentoria1", "Desc Mentoria 1", LocalDate.now());
        System.out.println(mentoria1);

        Conteudo mentoria2 = new Mentoria("Mentoria2", "Desc Mentoria 2", LocalDate.now());
        System.out.println(mentoria2);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Descricao Java");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria1);

        Dev fabiano = new Dev("Fabiano");
        fabiano.inscreverNoBootcamp(bootcamp);
        System.out.println(fabiano.getConteudosInscritos());
        fabiano.progredir();
        System.out.println(fabiano.getConteudosInscritos());
        System.out.println(fabiano.getConteudosFinalizados());

        System.out.println(bootcamp);

    }
}
