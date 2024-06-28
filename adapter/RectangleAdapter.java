package adapter;

public class RectangleAdapter extends Rectangle{
    private Carre carre;
    private Triangle triangle;

    public RectangleAdapter(Carre carre) {
        super(carre.getCote(), carre.getCote());
        this.carre = carre;
    }

    public RectangleAdapter(Triangle triangle) {
        super(triangle.getBase(), triangle.getHauteur());
        this.triangle = triangle;
    }

}
