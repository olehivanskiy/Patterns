package main.java.singleton.simple;

public class TestSimpleSingleton {
    public static void main(String[] args) {
        Person firstPerson = new Person("Oleh", 91);
        Person secondPerson = new Person("Riko", 32);
        Singleton firstSingleton = Singleton.getInstance(firstPerson);
        Singleton secondSingleton = Singleton.getInstance(secondPerson);
        System.out.println(firstSingleton.object);
        System.out.println(secondSingleton.object);
    }
}
