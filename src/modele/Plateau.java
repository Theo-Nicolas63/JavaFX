package modele;

import java.util.ArrayList;

public class Plateau {

    private ArrayList<Objet> lesObjets = new ArrayList<Objet>();
    private int TailleX;
    private int TailleY;
    private Bonhomme joueurCourant;

    public Plateau(ArrayList<Objet> lesObjets,int x,int y,Bonhomme joueurCourant){
        this.lesObjets = lesObjets;
        this.TailleX = x;
        this.TailleY = y;
        this.joueurCourant = joueurCourant;
    }

    public Bonhomme getJoueurCourant() {
        return this.joueurCourant;
    }

    public int getTailleX() {
        return TailleX;
    }

    public int getTailleY() {
        return TailleY;
    }

    public ArrayList<Objet> getLesObjets() {
        return lesObjets;
    }

    @Override
    public String toString() {
        return "Plateau{" +
                "lesObjects=" + lesObjets +
                ", joueurCourant=" + joueurCourant +
                '}';
    }
}
