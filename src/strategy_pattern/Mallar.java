package strategy_pattern;

public class Mallar extends strategy_pattern{
    public Mallar(){
        quackBehavior=new Quack();
        flyBehavior=new Flynowith();
    }
    public void display(){
        System.out.println("我是一个真鸭子");
    }
}
