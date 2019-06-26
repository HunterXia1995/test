package test1;

import java.util.*;
public class Client {
    FoodManager FM=new FoodManager();
    Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Client client=new Client();
        client.start();
    }
    public void start(){
        while(true){
            int num=printScreen();
            switch(num){
                case 1:
                   addFood();
                    break;
                case 2:
                    findFood();
                    break;
                case 3:
                    queryAll();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    total();
                    break;
                case 6:
                    highest();
                    break;
                case 7:
                    sort();
                    break;
                case 8:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }
    public int  printScreen(){
        System.out.println("欢迎使用");
        System.out.println("请选择模式");
        System.out.println("1.增加新商品");
        System.out.println("2.根据食品名字查询信息");
        System.out.println("3.查询所有商品信息");
        System.out.println("4.修改食品信息");
        System.out.println("5.计算所有食品总价");
        System.out.println("6.统计最贵商品信息");
        System.out.println("7.价格升序排列，数量降序排列");
        System.out.println("8.退出");
        System.out.println("输入要选择模式");
        int num=input.nextInt();
        return num;
    }
    public void addFood(){
        System.out.println("输入要新增的商品名称");
        String name=input.next();
        System.out.println("输入要新增的商品价格");
        double price=input.nextDouble();
        System.out.println("输入要新增的商品数量");
        int  count=input.nextInt();
        Food food=new Food(name,price,count);
        if(FM.addFood(food)==true){
            System.out.println("添加成功");
        }
        else{
            System.out.println("添加失败");
        }
    }
    public void findFood(){
        System.out.println("输入要查找的商品名称");
        String name=input.next();
        print(FM.findFood(name));
    }
    public void queryAll(){
        print(FM.queryAll());
    }
    public void update(){
        System.out.println("输入要新增的商品名称");
        String name=input.next();
        System.out.println("输入要新增的商品价格");
        double price=input.nextDouble();
        System.out.println("输入要新增的商品数量");
        int  count=input.nextInt();
        Food food=new Food(name,price,count);
        print(FM.update(food));
    }
    public void total(){
        double total= FM.total();
        System.out.println(total);
    }
    public void highest(){
        print(FM.highest());
    }
    public void sort(){
        print(FM.sort());
    }
    public void print(Food...food){
        if(food==null&&food.length==0){
            System.out.println("输出暂无此商品");
        }
        System.out.println("名字\t价钱\t数量");
        for(int i=0;i<food.length;i++){
            System.out.println(food[i].getName()+"\t"+food[i].getPrice()+"\t"+food[i].getCount());
        }
    }
}
