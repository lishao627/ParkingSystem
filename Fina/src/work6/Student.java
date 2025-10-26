package work6;

public class Student {
    String name;
    int age;
    int score;
    public Student(String name,int age,int score){
        this.name=name;
        this.score=score;
        this.age=age;

    }
    public void printInfo(){
        System.out.println("我叫"+name+",今年"+age+"岁，高考分数为"+score);
    }
    public int getScore() {
        return score;
    }
    public String getName(){
        return name;


    }
    public int getAge(){
        return age;
    }


}
