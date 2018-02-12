import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CheckingBD {

    public static void chekingBD(ArrayList<Person> people) {
        for (Person p : people) {
            Date currnetDate = new Date();
            SimpleDateFormat today = new SimpleDateFormat("dd.MM.");
            String dayWithMomth = p.getDate().substring(0, 6);
            if (dayWithMomth.equals(today.format(currnetDate))) {
                System.out.println("У " + p.getName() + " " + p.getSurname() + " день рождения, ей сегодня " +
                       chekingYear(p) + " лет");
                OutFrame.printPhotoOfBirthMan(p);
            }
        }
    }

    public static Integer chekingYear(Person p) {
        Date currnetDate = new Date();
        SimpleDateFormat today = new SimpleDateFormat("yyyy");
        Integer currentYear = Integer.parseInt(today.format(currnetDate));
        String personBirthYear = p.getDate().substring(6,10);
        Integer personBy = Integer.parseInt(personBirthYear);
        return currentYear-personBy;

    }

    public static void announceBirthDay(ArrayList<Person> people){

    }

}