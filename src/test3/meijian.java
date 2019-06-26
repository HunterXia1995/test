package test3;

public class meijian implements Price {
    double price;
    double jian;

    public meijian( double price,double jian) {
        this.jian=jian;
        this.price=price;
    }

    @Override
    public double way(double totalprice) {
      totalprice-=(totalprice/price*jian);
      return totalprice;
    }

}
