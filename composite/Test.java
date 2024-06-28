package composite;

public class Test {

    public static void main(String[] args) {
        Fichier f1 = new Fichier("modjo.txt");
        Fichier f2 = new Fichier("modjo2.txt");
        Fichier f3 = new Fichier("modjo3.txt");
        Fichier f4 = new Fichier("modjo4.txt");

        Dossier d1 = new Dossier("zezeul");
        Dossier d2 = new Dossier("Mariama");

        f1.afficher();

        d1.ajouter(f2);
        d1.afficher();

        d2.ajouter(f3);
        d2.ajouter(f4);
        d2.afficher();
    }
}
