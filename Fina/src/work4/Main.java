package work4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int n=scanner.nextInt();
        scanner.nextLine();
        Student []students=new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("请输入第"+(i+1)+"个同学的姓名：");
            String name=scanner.nextLine();
            System.out.println("请输入第"+(i+1)+"个同学的成绩：");
            int score=scanner.nextInt();
            scanner.nextLine();
            students[i]=new Student(name,score);

        }
            System.out.println("\n学生信息");
            for (Student s:students) {
                s.printInfo();
            }
        int total=0;
            int max=students[0].getScore();
            int min=students[0].getScore();
            String maxn=students[0].getName();
            String minn=students[0].getName();

            for (Student s: students          ) {
                int score = s.getScore();
                total += score;

                if (score > max) {
                    max = score;
                    maxn = s.getName();
                }

        if (score<min){
            min=score;
            minn=s.getName();
        }
            }
            double average=1.0*total/n;
            System.out.println("\n平均分："+average);
            System.out.println("最高分："+max+",学生："+maxn);
            System.out.println("最低分："+min+",学生："+minn);


    }
}
