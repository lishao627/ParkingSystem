package practice1;

import java.util.Scanner;//小型计算机

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double num1 =sc.nextDouble();
        System.out.println("请输入第二个数字：");
        double num2 =sc.nextDouble();
        System.out.println("请输入运算符（+，-，*，/）：");
        String operator=sc.next();

        double result=caul( num1, num2,operator);
        System.out.println("计算结果是："+result);
    }
    public static double caul(double num1,double num2,String operator){
        double result=0;
        switch(operator){
            case "+":
                result=num1+num2;
                break;
                case "-":
                    result=num1-num2;
                    break;
                    case "*":
                        result=num1*num2;
                        break;
                        case "/":
                            result=num1/num2;
                            break;
            default:
                System.out.println("计算有误，请重新输入：");


        }
        return result;
    }

}
