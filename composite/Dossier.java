package composite;

import java.util.ArrayList;

public class Dossier extends Noeud{
    private String nomDossier;
    private ArrayList<Noeud>  elements;

    public Dossier(String nomDossier) {
        this.nomDossier = nomDossier;
        this.elements = new ArrayList<>();
    }

    public void ajouter(Noeud noeud) {
        elements.add(noeud);
    }

    public void afficher() {
        System.out.println("je suis un dossier --> " + nomDossier);
        for (Noeud noeud : elements) {
            noeud.afficher();
        }
    }
}
