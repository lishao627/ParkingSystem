package work2;
import java.util.Scanner;
public class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        if (a == null || a.length == 0 || a[0].length == 0) {
            return null;
        }

        Location location = new Location();
        location.maxValue = a[0][0];
        location.row = 0;
        location.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入二维数组的行数: ");
        int rows = input.nextInt();
        System.out.print("请输入二维数组的列数: ");
        int cols = input.nextInt();

        double[][] array = new double[rows][cols];

        System.out.println("请输入二维数组的元素:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location location = locateLargest(array);

        System.out.printf("最大元素是 %.2f，位于第 %d 行，第 %d 列%n",
                location.maxValue, location.row + 1, location.column + 1);
    }
}

