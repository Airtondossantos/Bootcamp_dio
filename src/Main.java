import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitle("Java 24");
        cursoJava.setDescription("Curso de Java 24, para quem está querendo inicar na linguagem");
        cursoJava.setDuration(10d);

        Curso cursoSpring = new Curso();
        cursoSpring.setTitle("curso do framework Spring");
        cursoSpring.setDescription("Neste curso utilizaremos Spring Boot, Spring MVC, Spring Data, Spring Security");
        cursoSpring.setDuration(14d);

        Mentoria planoCarreira = new Mentoria();
        planoCarreira.setTitle("plano de carreira em java");
        planoCarreira.setDescription("nesta mentoria irei te guiar mostrar o passo a passo de como criar uma carreira em java");
        planoCarreira.setDate(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java 24");
        bootcampJava.setDescription("Bootcamp de java completo, do zero ao deploy");
        bootcampJava.getConteudos().add(cursoJava);
        bootcampJava.getConteudos().add(cursoSpring);
        bootcampJava.getConteudos().add(planoCarreira);

        Dev devAirton = new Dev();
        devAirton.setName("Airton");
        devAirton.inscreverBootcamp(bootcampJava);
        System.out.println(devAirton.getConteudosInscritos());
        devAirton.progredir();
        devAirton.progredir();
        System.out.println(devAirton.getConteudosInscritos());
        System.out.println(devAirton.getConteudosCompletos());
        System.out.println(devAirton.calcularTotalXp());

        Dev devJailton = new Dev();
        devJailton.setName("Jailton");
        devJailton.inscreverBootcamp(bootcampJava);
        System.out.println(devJailton.calcularTotalXp());
        System.out.println(devJailton.getConteudosInscritos());




    }
}
