package factory;

public class GestionnaireImage {
    public static Image getInstance(int type) {
        if (type == 1) {
            return new Png();
        }
        if (type == 2) {
            return new Jpeg();
        }
        if (type == 3) {
            return new Heic();
        }

        return null;
    }
}
