package test8;

import java.util.Date;
import java.util.Scanner;

public class Date1 {

    private int year;
    private int month;
    private int date;

    public double Date2() {
        Date d=new Date();
        d.setYear(year);d.setMonth(month-1);d.setDate(date);
        return d.getTime();

    }

    public Date1(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate() {
        Scanner input=new Scanner(System.in);
        System.out.println("你的出生日份：");
        int date=input.nextInt();
        this.date = date;

    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        Scanner input=new Scanner(System.in);
        System.out.println("你的出生年份：");
        int year=input.nextInt();
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth() {
        Scanner input=new Scanner(System.in);
        System.out.println("你的出生月份：");
        int month=input.nextInt();
        this.year = month;
    }

    @Override
    public String toString() {
        return "Date1{" +
                "year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }
}
