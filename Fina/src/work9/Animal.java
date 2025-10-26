package work9;

public class Animal {
    public void speak(){
        System.out.println("动物发出声音");
    }

}
class Dog extends Animal{//同一个文件中类之间不可以嵌套，第一个类前面有public后面的都不能加上public
    @Override
    public void speak() {
        System.out.println("汪汪！");
    }
}
class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("喵喵！");
    }
}

class Pig extends Animal{
    @Override
    public void speak() {
        System.out.println("哼哼~");

    }
}
class AnimalTrainer{
    public void train(Animal animal){
        animal.speak();
    }
}
