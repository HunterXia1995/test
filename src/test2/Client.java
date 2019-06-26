package test2;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        Book[] bookarr=new Book[5];
        Book book = new FreeBook();
        book.setPrice(150);
        book.setName("长得太帅如何与人相处");
        ((FreeBook) book).ActualPrice();
        bookarr[0]=book;
        System.out.println("书名"+book.getName());
        System.out.println("原价"+book.getPrice());
        System.out.println(((FreeBook) book).ActualPrice());
    }
}