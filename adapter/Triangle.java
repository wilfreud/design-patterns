package adapter;

public class Triangle {
    private int base;
    private int hauteur;
    public Triangle(int base, int hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public int getBase() {
        return base;
    }

    public int getHauteur(){
        return hauteur;
    }

    public int getSurface() {
        return (base * hauteur)/2;
    }

}
