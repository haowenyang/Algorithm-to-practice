package strategy_pattern;

public abstract class strategy_pattern {
    //策略模式
    FLYBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performfly(){
        flyBehavior.fly();
    }
    public void  performquack(){
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("我会游泳");
    }
    public void setFlyBehavior(FLYBehavior fb){
        flyBehavior=fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
}
