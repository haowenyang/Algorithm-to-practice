package strategy_pattern;

public class ModeDuck extends strategy_pattern{
    public ModeDuck(){
        flyBehavior=new Flynowith();
        quackBehavior=new Quack();

    }
    public void display(){
        System.out.println("模型鸭");
    }
}
