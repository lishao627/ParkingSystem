package vehicle;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class ParkingLot {
    private List<ParkingSpot>  spots;

    public  ParkingLot(int capacity){
        spots=new ArrayList<>();
        for(int i=1;i<=capacity;i++){
            spots.add(new ParkingSpot(i));
        }
    }
    public boolean parkVehicle(Vehicle vehicle){
        for (ParkingSpot spot:spots){
            if(!spot.isOccupied()){
                spot.parkVehicle(vehicle);
                System.out.println("停车成功，分配到车位号："+spot.getSpotNumber());
                return  true;
            }
        }
        System.out.println("停车失败：停车场已满");
        return false;
    }
    public Vehicle releaseVehicle(String plateNumber) {
        for (ParkingSpot spot : spots) {
            if (spot.isOccupied() && spot.getParkedVehicle().getPlateNumber().equalsIgnoreCase(plateNumber)) {
                Vehicle vehicle = spot.getParkedVehicle();
                LocalDateTime inTime = spot.getParkedTime();
                LocalDateTime outTime = LocalDateTime.now();
                double fee = vehicle.calculateFee(outTime);
                System.out.println("车辆【" + plateNumber + "】出场成功");
                System.out.println("停车时间：" + inTime + " - " + outTime);
                System.out.printf("停车费用：%.2f 元%n", fee);
                spot.releaseVehicle();
                return vehicle;  // 返回被释放的车辆对象
            }
        }
        System.out.println("未找到车牌号" + plateNumber + "的车辆");
        return null;  // 找不到则返回null
    }


public void displayStatus(){
    System.out.println("当前停车场状态：");
    for (ParkingSpot spot:spots){
        System.out.println(spot);
    }
}
    public List<ParkingSpot> getSpots() {
        return spots;
    }
    public String getStatusReport() {
        StringBuilder sb = new StringBuilder();
        for (ParkingSpot spot : spots) {
            sb.append("车位 " + spot.getSpotNumber() + ": ");
            if (spot.isOccupied()) {
                sb.append("已占用 - " + spot.getParkedVehicle().toString() + "\n");
            } else {
                sb.append("空闲\n");
            }
        }
        return sb.toString();
    }

}
