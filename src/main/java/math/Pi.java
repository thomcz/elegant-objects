package math;

public class Pi implements Constant {
    private static final double PI = 3.14159265358979323846;

    @Override
    public double value() {
        return PI;
    }
}
