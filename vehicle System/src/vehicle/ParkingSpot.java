package vehicle;

import java.time.LocalDateTime;
//在 ParkingSpot 和 ParkingLot 中通过父类 Vehicle 的引用调用子类对象的重写方法，实现了运行时多态：
public class ParkingSpot {
    private int spotNumber;
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private LocalDateTime parkedTime;

    public  ParkingSpot(int spotNumber){
        this.spotNumber=spotNumber;
        this.isOccupied=false;
        this.parkedVehicle=null;
    }

    public boolean parkVehicle(Vehicle vehicle){//停车
        if(!isOccupied){
            this.parkedVehicle=vehicle;
            this.parkedTime=LocalDateTime.now();
            this.isOccupied=true;
            return true;
        }
        return false;
    }

    public Vehicle releaseVehicle(){//取车，释放车位
        if(isOccupied){
            Vehicle t=parkedVehicle;
            this.parkedVehicle=null;
            this.parkedTime=null;
            this.isOccupied=false;
            return  t;
        }
        return null;
    }
    public  boolean isOccupied(){
        return isOccupied;
    }
    public int getSpotNumber(){
        return spotNumber;
    }
    public Vehicle getParkedVehicle(){
        return parkedVehicle;
    }
    public LocalDateTime getParkedTime(){
        return  parkedTime;
    }

    @Override
    public String toString() {
        if(isOccupied())
        {return "车位编号{" + spotNumber + ", 已被占用" + parkedVehicle.toString();}
        else{
            return "车位编号："+spotNumber+"，当前空闲";
        }
    }

}
//停车（parkVehicle()）与取车（releaseVehicle()）逻辑清晰，一目了然。
//
//每个 ParkingSpot 可存一辆 Vehicle，体现组合关系。
//
//使用布尔变量 isOccupied 控制状态，避免空指针。
//
//toString() 方便后续调试或打印当前状态。