package test5;
/*
 * 随机产生六个红色的球，范围在1-32之间，且不错复，在随机产生一个
 * 蓝色球，数字在1-16范围之间。
 */
import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        for(int j=0;j<5;j++){
            arr.clear();
        for (int i = 0;i<6;i++ ) {
            int num = (int) (Math.random() * 32 + 1);
            //判断产生的随机数是否存在与集合中
                boolean a=arr.contains( num);
                //如果存在了再重新随机一次
                if(a==true){
                    i--;
                    continue;
                }
                //否则添加此随机数到数组中
                else{
                    arr.add(num);
                }
        }

            int num1=(int) (Math.random() * 16 + 1);

                arr.add(num1);

            printInfo(arr);
            System.out.println();
        }

    }
    private static void printInfo(List arr) {
        for(Object  o : arr) {
            System.out.print(o+"\t");
        }
    }
}