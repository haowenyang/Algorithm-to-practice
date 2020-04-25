package strategy_pattern;

public class Minipower{
    public static void main(String[] args){
        ModeDuck duck=new ModeDuck();

        duck.performquack();
        duck.performfly();
        duck.swim();
        duck.display();
    }
}
