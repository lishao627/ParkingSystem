package work9;

public class Main {
    public static void main(String[] args) {
        Animal  []animals=new Animal[3];//可以创建装Animal及其子类对象的数组
        AnimalTrainer s1=new AnimalTrainer();
        animals[0]=new Dog();
        animals[1]=new Cat();
        animals[2]=new Pig();
        for(Animal a:animals){//多态调用
            s1.train(a);//更好的体现面向对象设计，为之后更多的训练动作打下基础
        }


    }


}
//Animal a：使用 父类类型 来接收数组中的每一个元素（这些元素实际上是子类对象，如 Dog、Cat 等）。
//
//a.speak();：虽然变量是父类类型，但由于子类重写了 speak() 方法，运行时会自动调用子类的实现——这就是 多态的精髓：编译看父类，运行看子类。
