package modele;

public class Ramasseur {

    private Colisionneur col;

    public void ramasser(Objet o){
        if (col.estACote(o.getX(),o.getY())){
           //o.addObjet(o);
        }
    }
}
