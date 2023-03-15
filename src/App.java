import java.time.LocalDate;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Conteudo curso1 = new Curso("Java", "Curso Java", 30);
        System.out.println(curso1);

        Conteudo mentoria1 = new Mentoria("Mentoria1", "Desc Mentoria 1", LocalDate.now());
        System.out.println(mentoria1);
    }
}
