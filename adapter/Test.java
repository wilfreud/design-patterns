package adapter;

public class Test {
    public static void main(String[] args) {
        Carre carre = new Carre(15);
        Triangle triangle = new Triangle(29, 10);
        System.out.println("Surface triangle --> " + triangle.getSurface());

        RectangleAdapter adapter = new RectangleAdapter(triangle);
        int surface = adapter.getSurface();
        int longueur = adapter.getLongueur();
        int largeur = adapter.getLargeur();
        System.out.println("Longueur: " + longueur);
        System.out.println("largeur: " + largeur);
        System.out.println("surface: " + surface);
    }
}
