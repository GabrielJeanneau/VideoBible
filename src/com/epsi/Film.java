package com.epsi;

public class Film {
    private String nom;
    private String acteurP;
    private String realisateur;
    private String anneeSortie;
    private String support;
    private boolean dispo = true;

    public Film(String nom, String acteurP, String realisateur, String anneeSortie, String support){
        this.nom = nom;
        this.acteurP = acteurP;
        this.realisateur = realisateur;
        this.anneeSortie = anneeSortie;
        this.support = support;
    }

    public void show(){
        System.out.println("Film : "+nom+", Acteur Principal : "+acteurP+", Realisateur : "+realisateur+", Année de sortie : "+anneeSortie+", support : "+support+".");
    }

    public String giveName(){
        return this.nom;
    }

    public void filmLoue(){
        if(dispo == true){
            dispo = false;
            System.out.println("Vous avez bien loué ce film :"+nom);
        }
        else if(dispo == false){
            System.out.println("Le film "+nom+" est déjà loué.");
        }
    }

    public void filmRendu(){
        if(dispo == false){
            dispo = true;
            System.out.println("Vous avez bien rendue le film :"+nom);
        }
        else if(dispo == false){
            System.out.println("Le film "+nom+" est déjà disponible.");
        }
    }

}
