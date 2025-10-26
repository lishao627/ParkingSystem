package studing;

import java.util.Scanner;

public class ArrayStars {
    private int[] numbers;


    public ArrayStars(int n) {
        numbers = new int[n];
    }

    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ÇëÊäÈë " + numbers.length + " ¸öÊı×Ö£º");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }

    public int getMax() {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int getMin() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public int getSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public double getAverage() {
        return (double) getSum() / numbers.length;
    }
}
