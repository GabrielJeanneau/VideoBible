import com.epsi.Film;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome!");

        Film film1 = new Film("SDA", "acteur1", "realisateur1", "2001", "DVD");
        Film film2 = new Film("Hobbit", "acteur2", "realisateur2", "2001", "DVD");
        Film film3 = new Film("SW", "acteur3", "realisateur3", "2001", "DVD");
        Film film4 = new Film("Avatar", "acteur4", "realisateur4", "2001", "DVD");
        Film film5 = new Film("ouais", "acteur5", "realisateur5", "2001", "DVD");
        Film film6 = new Film("non", "acteur6", "realisateur6", "2001", "DVD");

        Vector v = new Vector<>();

        v.addElement(film1);
        v.addElement(film2);
        v.addElement(film3);
        v.addElement(film4);
        v.addElement(film5);
        v.addElement(film6);

        
    }
}
