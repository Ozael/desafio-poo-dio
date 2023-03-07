import com.ozael.domain.Bootcamp;
import com.ozael.domain.Course;
import com.ozael.domain.Dev;
import com.ozael.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Curso Java");
        course1.setDescription("Descrição curso Java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Curso JS");
        course2.setDescription("Descrição curso JS");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria de Java");
        mentoring.setDescription("Descrição mentoria Java");
        mentoring.setDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devAna = new Dev();
        devAna.setName("Ana");
        devAna.registeredBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Ana: " + devAna.getSubscribedContent());
        course1.setTitle("Curso Java");
        course1.setDescription("Descrição curso Java");
        course1.setWorkload(4);
        devAna.progress();
        System.out.println("Conteudos concluídos Ana: " + devAna.getFinishedContent());
        System.out.println("XP: " + devAna.calcTotalXP());

        System.out.println("--------------------------");

        Dev devBob = new Dev();
        devBob.setName("Bob");
        devBob.registeredBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Bob: " + devBob.getSubscribedContent());
        devBob.progress();
        System.out.println("Conteudos concluídos Bod: " + devBob.getFinishedContent());
        System.out.println("XP: " + devBob.calcTotalXP());


    }


}