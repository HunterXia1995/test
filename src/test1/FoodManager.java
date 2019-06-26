package test1;

public class FoodManager {
    Food[] foods=new Food[500];
    int count=0;
    public FoodManager(){
        foods[count++]=new Food("牛肉干",12,5);
        foods[count++]=new Food("果冻",4,7);
        foods[count++]=new Food("豆腐干",2,2);
    }
    public  boolean addFood(Food food){
        if(food==null){
            return false;
        }
        if(count>=500){
            return false;
        }
        if(findFood(food.getName())!=null){
            return false;
        }
        foods[count++]=food;
        return true;
    }
    public Food findFood(String name){
        for(int i=0;i<count;i++){
            if(name.equals(foods[i].getName())){
               return foods[i];
            }
            }
        return null;
        }

        public Food[] queryAll(){
        Food[] query=new Food[count];
            if(foods==null||query.length==0){
                return null;
            }
        for(int i=0;i<count;i++){
            query[i]=foods[i];
        }
        return query;
        }
        public Food update(Food food){
        for(int i=0;i<count;i++){
            if(food!=null&&food.getName().equals(foods[i].getName())){
                foods[i].setPrice(food.getPrice());
                foods[i].setCount(food.getCount());
                return foods[i];
            }
        }
        return null;
        }
        public double total(){
        double total=0;
        if(count==0){
            return -1;
        }
        for(int i=0;i<count;i++){
           total+=foods[i].getCount()*foods[i].getPrice();
        }
        return total;
        }
        public Food[] highest(){
                double max=foods[0]==null?0:foods[0].getPrice();
                if(max==0){
                    return null;
                }
                for(int i=0;i<count;i++){
                    if(max<foods[i].getPrice()){
                       max=foods[i].getPrice();
                    }
                }
                int $count=0;
                for(int i=0;i<count;i++){
                    if(max==foods[i].getPrice()){
                        $count++;
                    }
                }
                Food[] highest=new Food[$count];
                int j=0;
                for(int i=0;i<count;i++){
                    if(max==foods[i].getPrice()){
                        highest[j++]=foods[i];
                    }
                }
                return highest;
    }
        public Food[] sort(){
        if(foods==null||count==0){
            return null;
        }
        for(int i=0;i<count-1;i++){
            for(int j=0;j<count-1-i;j++){
                if(foods[j].getPrice()>foods[j+1].getPrice()){
                    Food target=foods[j];
                    foods[j]=foods[j+1];
                    foods[j+1]=target;
                }
                else if((foods[j].getPrice()==foods[j+1].getPrice())){
                    if(foods[j].getCount()<foods[j+1].getCount()){
                        Food target=foods[j];
                        foods[j]=foods[j+1];
                        foods[j+1]=target;
                    }
                }
            }
        }
        Food[] sort=new Food[count];
        for(int i=0;i<count;i++){
            sort[i]=foods[i];
        }
        return sort;
        }
    }

