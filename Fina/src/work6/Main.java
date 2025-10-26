package work6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("一共有几个学生：");
        int n=scanner.nextInt();
        scanner.nextLine();
        Student []students=new Student[n];

        for(int i=0;i<n;i++){
            System.out.println("请输入学生的姓名：");
            String name=scanner.nextLine();
            System.out.println("请输入学生的年龄");
            int age=scanner.nextInt();
            scanner.nextLine();
            System.out.println("请输入学生的成绩");
            int score=scanner.nextInt();
            scanner.nextLine();
            students[i]=new Student(name,age,score);

        }
        System.out.println("\n学生信息");
        for(Student s:students){
            s.printInfo();
        }
        int maxScore = students[0].getScore();
        String maxName = students[0].getName();
        int totalScore = 0;

        for (Student s : students) {
            int score = s.getScore();
            totalScore += score;
            if (score > maxScore) {
                maxScore = score;
                maxName = s.getName();
            }
        }
        double average = 1.0 * totalScore / n;
        System.out.println("平均分为：" + average);
        System.out.println("最高分为：" + maxScore + "，学生是：" + maxName);




    }

}
