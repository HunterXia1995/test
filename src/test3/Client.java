package test3;

public class Client {
    public static void main(String[] args) {
        Price price=new manjian(100,50);
        SuperMarket a=new SuperMarket();
        a.setPrice(price);
        double result=a.Aprice(150);
        System.out.println(result);


    }
}
