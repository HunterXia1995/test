package test3;

public class Discount implements Price {
    double b;
  public Discount( double b) {
        this.b=b;
    }

    @Override
    public double way(double totalprice) {
      ;
        return totalprice*b;
    }
}
