package adapter;

public class Rectangle {
    private int longueur;
    private int largeur;

    public Rectangle(int longueur, int largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public int getLongueur() {
        return longueur;
    }
    public int getLargeur() {
        return largeur;
    }
    public int getSurface() {
        return longueur * largeur;
    }
}
