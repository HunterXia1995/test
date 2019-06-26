import test7.Worker;
import java.util.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class GameManager {
    Map<String, Game> gg = new TreeMap<String,Game>();
    Scanner input=new Scanner(System.in);
    Collection<Game>  a=gg.values();
    //初始化
    public GameManager() {
        Game g = new Game("第一届", "1930年", "乌拉圭", "乌拉圭");
        Game g1 = new Game("第二届", "1934年", "意大利", "意大利");
        Game g2 = new Game("第三届", "1938年", "法国	", "意大利");
        Game g3 = new Game("第四届", "1950年", "巴西	", "乌拉圭");
        Game g4 = new Game("第五届", "1954年", "瑞士	", "西德");
        Game g5 = new Game("第六届", "1958年", "瑞典	", "巴西");
        Game g6 = new Game("第七届", "1962年", "智利	", "巴西");
        Game g7 = new Game("第八届", "1966年", "英格兰", "英格兰");
        Game g8 = new Game("第九届", "1970年", "墨西哥", "巴西");
        Game g9 = new Game("第十届", "1974年", "前西德", "西德");
        Game g10 = new Game("第十一届", "1978年", "阿根廷", "阿根廷");
        Game g11 = new Game("第十二届", "1982年", "西班牙", "意大利");
        Game g12 = new Game("第十三届", "1986年", "墨西哥", "阿根廷");
        Game g13 = new Game("第十四届", "1990年", "意大利", "西德");
        Game g14 = new Game("第十五届", "1994年", "美国	", "巴西");
        Game g15 = new Game("第十六届", "1998年", "法国	", "法国");
        Game g16 = new Game("第十七届", "2002年", "韩日	", "巴西");
        Game g17 = new Game("第十八届", "2006年", "德国	", "意大利");
        Game g18 = new Game("第十九届", "2010年", "南非	", "西班牙");
        Game g19 = new Game("第二十届", "2014年", "巴西	", "德国");
        gg.put(g.getTime(),g);gg.put(g1.getTime(),g1);gg.put(g2.getTime(),g2);gg.put(g3.getTime(),g3);
        gg.put(g4.getTime(),g4);gg.put(g5.getTime(),g5);gg.put(g6.getTime(),g6);gg.put(g7.getTime(),g7);
        gg.put(g8.getTime(),g8);gg.put(g9.getTime(),g9);gg.put(g10.getTime(),g10);gg.put(g11.getTime(),g11);
        gg.put(g12.getTime(),g12);gg.put(g13.getTime(),g13);gg.put(g14.getTime(),g14);gg.put(g15.getTime(),g15);
        gg.put(g16.getTime(),g16);gg.put(g17.getTime(),g17);gg.put(g18.getTime(),g18);gg.put(g19.getTime(),g19);
    }
    //查询词国家是否获得冠军
    public void input(){
        System.out.println("请输入要查询的国家：");
        String name=input.next();
        int i=0;
        for( Game b:a){
            if(name.equals(b.getChampion())){
            System.out.println(b.getTime());
            i++;
            }
        }
        if(i==0){
            System.out.println(name+"没有获得过世界冠军");
        }
    }
    //查询此年份获得冠军的时间
    public void jiben(){
        System.out.println("请输入要查询的年份：（列：1930年）");
        String year=input.next();
        if(gg.get(year)==null){
            System.out.println("没有举办过世界杯");
        }
       else{ System.out.println(year+"获得世界冠军的是："+gg.get(year).getChampion());}
    }
    //运行程序main方法
    public static void main(String[] args) {
        GameManager GM=new GameManager();
        GM.jiben();
        GM.input();
    }
}