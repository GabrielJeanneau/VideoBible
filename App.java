import com.epsi.Client;
import com.epsi.Film;
import java.util.*;

public class App {

    static void deleteFilmByName(String name, Vector v){
        for(int i = 0; i < v.size(); i++){
            if( ((Film)(v.elementAt(i))) .giveName() == name){
                deleteFilm((Film)(v.elementAt(i)));
            }
        }
    }
    
    static void deleteFilm(Film f){
        f = null;
        System.gc();
        System.out.println("Le film a bien été supprimé.");
    }

    static void louer(Film f, Client c){
        f.filmLoue();;
        f.locataire = c.nom;
        System.gc();
        System.out.println("Le film a bien été loué.");
    }

    static void rendre(Film f, Client c){
        f.filmRendu();;
        f.locataire = null;
        System.gc();
        System.out.println("Le film a bien été rendu.");
    }

    static void addFilm(Vector v, Scanner sc){
        
        System.out.println("Entrez le titre du film : ");
        String nom = sc.next();
        System.out.println("Ensuite l'acteur principal : ");
        String acteurP = sc.next();
        System.out.println("Après ça le réalisateur : ");
        String realisateur = sc.next();
        System.out.println("Puis l'année de sortie du film : ");
        String anneeSortie = sc.next();
        System.out.println("Et enfin le type de support : ");
        String support = sc.next();

        Film f = new Film(nom, acteurP, realisateur, anneeSortie, support);
        System.out.println("Le film a été créé avec succès !");
    }

    static void louerFilm(Vector v, Scanner sc, Client c, String name){
        for(int i = 0; i < v.size(); i++){
            if( ((Film)(v.elementAt(i))) .giveName() == name){
                louer((Film)(v.elementAt(i)), c);
            }
        }
    }

    static void rendreFilm(Vector v, Scanner sc, Client c, String name){
        for(int i = 0; i < v.size(); i++){
            if( ((Film)(v.elementAt(i))) .giveName() == name){
                rendre((Film)(v.elementAt(i)), c);
            }
        }
    }


    static void listeFilmParSupport(Vector v, String supportUtiliser){

        for(int i = 0; i < v.size(); i++){
            if( ((Film)(v.elementAt(i))) .giveSupport() == supportUtiliser){
                System.out.println(v);;
            }
        }
    }

    

    public static void main(String[] args) throws Exception {

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

        //Utilisation du input : Scanner
        Scanner sc = new Scanner(System.in);
        String nom, prenom, mail;

        System.out.println("Entrez votre Nom : ");
        nom = sc.next();
        System.out.println("Ensuite votre Prenom : ");
        prenom = sc.next();
        System.out.println("Et enfin votre @mail : ");
        mail = sc.next();
        Client c = new Client(nom, prenom, mail);
        c.show();

        //Ajouter Film
        System.out.println("Voulez vous ajouter un film ? (oui=1)");
        int rep= sc.nextInt();
        while(rep==1){
            addFilm(v, sc);
            System.out.println("Voulez vous ajouter un autre film ? (oui=1)");
            if(sc.nextInt()!=1){
                rep=0;
            }
        }
        
        //Supprimer un film par le nom
        System.out.println("Quel film voulez vous suprimer ?");
        String name = sc.nextLine();
        deleteFilmByName(name, v);

        //Afficher la liste des films dispo et loué
        
 
    

        //Afficher la liste des films par support
        System.out.println("Quel support utilisez vous ?");
        String supportUtiliser = sc.nextLine();
        listeFilmParSupport(v, supportUtiliser);
        

        //Louer un film (Client)
        System.out.println("Quel film voulez vous louer ?");
        String titre = sc.nextLine();
        louerFilm(v, sc, c, titre);
        

        //Rendre un film (Client)
        System.out.println("Quel film voulez vous rendre ?");
        String titre2 = sc.nextLine();
        rendreFilm(v, sc, c, titre2);

        //Afficher les films loués par le client
    }
}
