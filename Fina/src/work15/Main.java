package work15;

public class Main {
    public static void main(String[] args) {
        Animal[]animals=new Animal[4];
        animals[0]=new Cat("小花");
        animals[1]=new Dog("仙子");
        animals[2]=new Bird("燕子");
        animals[3]=new Rabbit("忘机");
       for (Animal a:animals){
           a.makesound();
           a.sleep();
           if (a instanceof Pet){//判断对象是否实现了Pet接口
               ((Pet)a).play();//向下转型，把它从Animal转成Pet类型；
           }
           if(a instanceof Flyable){
               ((Flyable) a).fly();
           }
           if(a instanceof  Friendly){
               ((Friendly )a).beFriendly();
           }
           System.out.println("----------------------");
       }
    }
}
