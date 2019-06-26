package test3;

public class NoDiscount implements Price {
    @Override
    public double way(double totalprice) {
        return totalprice;
    }
}
