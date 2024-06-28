package singleton;

public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
            return instance;
        }
        return instance;
    }

    private Singleton() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
