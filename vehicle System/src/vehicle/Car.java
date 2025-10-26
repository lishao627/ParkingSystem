package vehicle;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car extends Vehicle {//只传车牌号，用Duration来计算停车时间
    public Car(String plateNumber){
        super(plateNumber,"小轿车");
    }

    @Override
    public double calculateFee(LocalDateTime outTime) {
        Duration duration=Duration.between(getInTime(),outTime);
        long totalMinutes=duration.toMinutes();
        long totalHours=(totalMinutes+59)/60;


        if(totalHours<=1){
            return 5.0;
        }
        else{
            return 5.0+(totalHours-1)*2.0;
        }
    }
}
 class Truck extends Vehicle {//只传车牌号，用Duration来计算停车时间
    public Truck(String plateNumber){
        super(plateNumber,"货车");
    }

    @Override
    public double calculateFee(LocalDateTime outTime) {
        Duration duration=Duration.between(getInTime(),outTime);
        long totalMinutes=duration.toMinutes();
        long totalHours=(totalMinutes+59)/60;


        if(totalHours<=1){
            return 8.0;
        }
        else{
            return 8.0+(totalHours-1)*4.0;
        }
    }
}
 class ElectricCar extends Vehicle {//只传车牌号，用Duration来计算停车时间
    public ElectricCar(String plateNumber){
        super(plateNumber,"电动车");
    }

    @Override
    public double calculateFee(LocalDateTime outTime) {
        Duration duration=Duration.between(getInTime(),outTime);
        long totalMinutes=duration.toMinutes();
        long totalHours=(totalMinutes+59)/60;


        if(totalHours<=2){
            return 3.0;
        }
        else{
            return 3.0+(totalHours-2)*1.5;
        }
    }
}
