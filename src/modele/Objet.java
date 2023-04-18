package modele;

public class Objet {

    private int x;
    private int y;
    private String image;

    public Objet(int x, int y, String image) {
        this.x = x;
        this.y = y;
        this.image = image;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getImage() {
        return this.image;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "x=" + x +
                ", y=" + y +
                ", image='" + image + '\'' +
                '}';
    }
}
