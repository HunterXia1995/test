package test2;

public class FreeBook extends Book {

    public double ActualPrice(){
        super.setPrice(0);
        double result=super.getPrice() ;
        return result;
    }
}
