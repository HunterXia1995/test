package test3;

public class SuperMarket {
  Price price=new NoDiscount();

    public void setPrice(Price price) {
        this.price = price;
    }
    public double Aprice(double totalprice){
        return this.price.way(totalprice);

    }
}
