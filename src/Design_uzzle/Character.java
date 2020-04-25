package Design_uzzle;

public abstract class Character {
    WeaponBehavior weapon;//WeaponBehavior行为类
    public Character(){

    }//构造方法
    public void Weapon(){
        weapon.useWeapon();
    }//将具体的实现方法留给行为类
    public abstract void fight();//定义了一个子类都有的抽象方法
}
