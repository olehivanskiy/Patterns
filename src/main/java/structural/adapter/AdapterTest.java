package main.java.structural.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Inch inch = new Inch(1);
        System.out.println("Way length in inch: " + inch.getValue());
        Meter meter = new Meter(2);
        InchAdapter inchAdapter = new InchAdapter(meter);
        System.out.println("Way length in inch (input type was meter): " + inchAdapter.getValue());
    }
}
