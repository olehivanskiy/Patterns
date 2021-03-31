package main.java.singleton.simple;

public class Singleton {

    private static Singleton instance;
    public Object object;

    private Singleton(Object object) {
        this.object = object;
    }

    public static Singleton getInstance(Object object) {
        if (instance == null) {
            instance = new Singleton(object);
        }
        return instance;
    }
}
