package modele;

import java.util.ArrayList;

public class Bonhomme extends Objet{

    private ArrayList<Objet> objetRamasse = new ArrayList<Objet>();
    private int score;

    public Bonhomme(int x, int y, String image, int score) {
        super(x, y, image);
        this.score = score;
    }
    public void addObjet(Objet o){
        objetRamasse.add(o);
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public String getImage() {
        return super.getImage();
    }

    @Override
    public String toString() {
        return "Bonhomme{" +
                "ObjetRamasse=" + objetRamasse +
                '}';
    }
}
