package composite;

public class Fichier extends Noeud{
    private String nomFichier;
    public Fichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }
    public void afficher() {
        System.out.println("Je suis un fichier -->" + nomFichier);
    }
}
