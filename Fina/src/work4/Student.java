package work4;

public class Student {
    String name;
    int score;

    public  Student(String name,int score){
        this.name=name;
        this.score=score;

    }
    public void printInfo(){
        System.out.println(name+"的分数是："+score);

    }

    public int getScore() {
        return score;
    }
    public String getName(){
        return name;
    }
}
