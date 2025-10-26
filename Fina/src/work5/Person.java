package work5;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public  void sayHello(){
        System.out.println("我是"+name+",今年"+age+"岁了。");
    }
}
  class Student extends Person{//一个 Java 文件只能有一个 public 类
    String school;
    int score;
    public Student(String name,int age,String school,int score){
        super(name,age);//调用父类构造器
        this.school=school;
        this.score=score;

    }

    @Override//重写父类的方法
    public void sayHello() {
        System.out.println("我是"+name+",今年"+age+"岁了,来自"+school+",高考"+score+"分");
    }
}



