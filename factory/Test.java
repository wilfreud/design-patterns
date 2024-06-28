package factory;

public class Test {
    public static void main(String[] args) {
        Image i1 = GestionnaireImage.getInstance(1);
        i1.qui();
        Image i2 = GestionnaireImage.getInstance(2);
        i2.qui();
        Image i3 = GestionnaireImage.getInstance(3);
        i3.qui();
    }
}
