package test4;

public  abstract  class Process {
    /*
     *建立制作鸡腿流程抽象类
     */
    public void Food(){
        System.out.println("1.选择食材鸡腿肉");
    }
    public abstract  void ModulaitonOfWater();

    public   abstract  void FriedChickenLeg();

    public   abstract  void Hamburger();

    public   abstract  void pack();
    public   abstract  void SlleingPrice();
    public void Do(){
        this.Food();
        this.ModulaitonOfWater();
        this.FriedChickenLeg();
        this.Hamburger();
        this.pack();
        this.SlleingPrice();
    }

}
