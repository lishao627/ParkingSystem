package studing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("请输入你要输入的数字个数：");
        int n = scanner.nextInt();
        ArrayStars stars=new ArrayStars(n);
                stars.inputNumbers();

        System.out.println("最大值是：" + stars.getMax());
        System.out.println("最小值是：" + stars.getMin());
        System.out.println("总和是：" + stars.getSum());
        System.out.println("平均值是：" + stars.getAverage());
    }
}








