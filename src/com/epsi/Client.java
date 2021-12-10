package com.epsi;

public class Client {

    private String nom;
    private String prenom;
    private String mail;

    public int nbFilm = 0;

    public Client(String nom, String prenom, String mail){
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }

    public void filmLoue(){
        if(nbFilm >=5){
            System.out.println("Vous loué déjà 5 films");
        }
        else{
            nbFilm++;
            System.out.println("OK");
        }
    }

    public void filmRendue(){
        if(nbFilm <=0){
            System.out.println("Vous n'avez loué aucun film");
        }
        else{
            nbFilm--;
            System.out.println("Film rendue");
        }
    }

    public void show(){
        System.out.println("Bienvenue "+nom+" "+prenom+". Votre adresse mail : "+mail+" !");
    }
}
