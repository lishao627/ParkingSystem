package work8;

public class Student {
    private String name;
    private int age;
    private  int score;
//有两个构造方法，1没传入age,score，=0
// 2.传入了不需要=0
    public Student(String name,int age,int score){//只传入名字，其他默认是0
        this.age=age;
        this.name=name;
        this.score=score;
    }
    public Student(String name){
        this.name=name;
        this.age=0;
        this.score=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {//把传进来的参数赋值给成员变量
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void printInfo(){
        System.out.println("姓名：" + name + "，年龄：" + age + "，成绩：" + score);
    }
}
