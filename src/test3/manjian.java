package test3;

public class manjian implements Price {
    double price;
    double jian;

    public manjian(double price,double jian) {
        this.price=price;
        this.jian=jian;
    }

    @Override
    public double way(double totalprice) {
        if(totalprice>price){
            totalprice-=jian;

        }
        return  totalprice;
    }
}
