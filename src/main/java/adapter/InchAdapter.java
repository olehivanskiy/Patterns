package main.java.adapter;

public class InchAdapter extends Inch {
    private Meter meter;

    public InchAdapter(Meter meter) {
        this.meter = meter;
    }

    @Override
    public double getValue() {
        double result;
        result = meter.getValue() * 39.3700787;
        return result;
    }
}
