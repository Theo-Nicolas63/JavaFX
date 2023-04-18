package modele;

public class Deplaceur {

    private Colisionneur col;

    public void deplacerHaut(Objet o){
        if (!col.estPresent(o.getX(),o.getY()-1)){
            o.setY(o.getY()-1);
        }
    }

    public void deplacerBas(Objet o){
        if (!col.estPresent(o.getX(),o.getY()+1)){
            o.setY(o.getY()-1);
        }
    }
    public void deplacerGauche(Objet o){
        if (!col.estPresent(o.getX()-1,o.getY())){
            o.setX(o.getX()-1);
        }
    }
    public void deplacerDroite(Objet o){
        if (!col.estPresent(o.getX()+1,o.getY())){
            o.setX(o.getX()+1);
        }
    }

}
