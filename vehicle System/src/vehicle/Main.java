package vehicle;
import vehicle.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 ParkingLot parkingLot=new ParkingLot(5);
        Scanner scanner=new Scanner(System.in);

        System.out.println("欢迎使用智能停车场系统");
                boolean running =true;
        while(running){
            System.out.println("\n====== 主菜单 ======");
            System.out.println("1. 停车");
            System.out.println("2. 取车");
            System.out.println("3. 查看车位状态");
            System.out.println("4. 退出系统");
            System.out.print("请选择操作（1-4）：");

            String choice=scanner.nextLine();

            switch (choice){
                case"1":
                    System.out.println("请输入车牌号：");
                    String plate=scanner.nextLine();
                    System.out.println("请选择车辆类型（1.小轿车 2.货车 3.电动车）：");
                    String type=scanner.nextLine();
                    Vehicle v=null;
                    switch (type){
                        case "1":
                            v=new Car(plate);
                            break;
                        case"2":
                            v=new Truck(plate);
                            break;
                        case "3":
                            v=new ElectricCar(plate);
                            break;
                        default:
                            System.out.println("车辆类型输入有误！！！");
                            continue;

                    }
                    parkingLot.parkVehicle(v);
                    break;

                case "2":
                    System.out.print("请输入车牌号：");
                    String outPlate = scanner.nextLine();
                    parkingLot.releaseVehicle(outPlate);
                    break;

                case"3":
                    parkingLot.displayStatus();//车辆状态
                    break;

                case "4":
                    System.out.println("系统已退出，感谢使用！");
                    running=false;
                    break;

                default:
                    System.out.println("请输入有效选项！");
                    break;
            }
        }
        scanner.close();
    }
}
