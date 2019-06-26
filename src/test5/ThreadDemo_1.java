package test5;



public class ThreadDemo_1 {
    public static void main(String[] args) {
    TestThread th=new TestThread();
    new Thread(th).start();
        for(int i=0;i<5;i++){
            System.out.println("Main在运行");
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

}
class TestThread1 implements Runnable{
    public void run(){
          for(int i=0;i<5;i++){
              System.out.println("Test在运行");
              try{
                  Thread.sleep(1000);
              }
              catch (InterruptedException e){
                  e.printStackTrace();
              }
          }
    }
}