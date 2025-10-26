package vehicle;

import java.time.LocalDateTime;

public abstract class Vehicle {
    private String plateNumber;//private将数据封装起来
    private String type;
    private LocalDateTime inTime;

    public Vehicle(String plateNumber, String type) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.inTime = LocalDateTime.now();
    }
    public String getPlateNumber(){
        return plateNumber;
    }
    public  String getType(){
        return type;
    }
    public  LocalDateTime getInTime(){
        return  inTime;
    }
    public void setInTime(LocalDateTime inTime){
        this.inTime=inTime;
    }
public abstract  double calculateFee(LocalDateTime outTime);

    @Override//方法继承
    public String toString() {
        return "车牌" + plateNumber + "车型：" + type + ",入场时间" + inTime.toString() ;
    }
}
