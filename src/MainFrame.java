import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainFrame {

    public static void main(String[] args) {

        Person Timur = new Person("Timur", "Kazakov", "21.04.1988", new File ("/home/timur/IdeaProjects/CalendarDate/Img/Timur.jpg"));
        Person Stas = new Person("Stanislav", "Bobrov", "21.04.1988", new File ("/home/timur/IdeaProjects/CalendarDate/Img/Stas.jpg"));
        Person Linett = new Person("Linett", "Kazakova", "09.02.2015", new File ("/home/timur/IdeaProjects/CalendarDate/Img/Linett.jpg"));
        System.out.println(Person.getAllPersons().size());
        System.out.println(Person.getAllPersons().get(0));
        System.out.println(Person.getAllPersons().get(1));
        System.out.println(Person.getAllPersons().get(2));
        System.out.println(new Date("JUNE"));
        SimpleDateFormat x = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(x.format(new Date()));
        CheckingBD.chekingBD(Person.getAllPersons());

    }

}
