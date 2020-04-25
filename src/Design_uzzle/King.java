package Design_uzzle;

public class King extends Character{
    public King(){
        weapon=new KnifeBehavior();
    }
    public void fight(){
        System.out.println("我是国王");
    }
}
