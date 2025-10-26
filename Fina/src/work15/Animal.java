package work15;

public abstract class Animal {//定义抽象类
String name;
public Animal(String name){
    this.name=name;

}
public abstract  void  makesound();//抽象方法
public void sleep(){//普通方法，有实现
    System.out.println(name+"正在睡觉。。。。。。");
}
}//这个animal类不能直接new出对象，但可以被继承，子类必须重新写
interface Pet{
    void play();
}
interface Flyable{
    void fly();
}
interface Friendly{
    void beFriendly();
}
class Cat extends Animal implements Pet{
public Cat(String name){
    super(name);
}

    @Override
    public void makesound() {
        System.out.println(name+"喵喵喵~");
    }

    @Override
    public void play() {
        System.out.println(name+"正在玩毛线球~");
    }
}
//抽象类不能被实例化，更像一种模板
//抽象类是“模板”，接口是“能力”。抽象类用来“是什么”，接口用来“能做什么”
//抽象方法（只有方法名），普通方法（有内容），成员变量(属性)
class Dog extends Animal implements Pet,Friendly{
    public Dog(String name){
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println(name+"汪汪叫！");
    }

    @Override
    public void play() {
        System.out.println(name+"正在开心地玩飞盘！");
    }

    @Override
    public void beFriendly() {
        System.out.println(name+"摇尾巴亲亲你！");
    }
}
class Bird extends Animal implements Flyable{
    public  Bird(String name){
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println(name+"叽叽喳喳！");
    }

    @Override
    public void fly() {
        System.out.println(name+"在天空飞翔！");
    }
}
class Rabbit extends Animal implements  Pet{
    public Rabbit(String name){
        super(name);
    }

    @Override
    public void makesound() {
        System.out.println(name+"蹦蹦蹦~");
    }

    @Override
    public void play() {
        System.out.println(name+"在草地上跳来跳去！");
    }
}