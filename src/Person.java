import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public  class Person {

    private static ArrayList<Person> allPersons = new ArrayList<>();
    private String name;
    private String surname;
    private String date;
    private File imagine;

    public static ArrayList<Person> getAllPersons() {
        return allPersons;
    }

    public static void setAllPersons(ArrayList<Person> allPersons) {
        Person.allPersons = allPersons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public File getImagine() {
        return imagine;
    }

    public void setImagine(File imagine) {
        this.imagine = imagine;
    }




    public Person(String name, String surname, String date, File imagine) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.imagine = imagine;
        allPersons.add(Person.this);
    }


    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }




}
