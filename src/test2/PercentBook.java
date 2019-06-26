package test2;

public class PercentBook extends Book {
   private double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double ActualPrice(){
        double result=a*super.getPrice();
        return result;
    }
}
