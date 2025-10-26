package work7;

public class Person {
    String name;
    int age;

    public  Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void sayHello(){
        System.out.println("我是" + name + "，今年" + age + "岁了。");
    }

}
class Student extends Person{
    String school;
    public Student(String name,String  school,int age){
        super(name, age);
        this.school=school;

    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("我在 " + school + " 上学。");
    }
}
class Teacher extends Person{
    String school;
    public  Teacher(String name,int age,String school){
        super(name, age);
        this.school=school;
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("我在 " + school + " 教书。");
    }
}
