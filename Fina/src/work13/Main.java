package work13;

//你能发现：接口之间用逗号隔开；

//实现多个接口的时候，必须实现所有接口的方法；

   //     多接口实现可以让类像“多重继承”一样，拥有多种能力。
interface Workable{
    void work();
   }
   interface Chargeable{
    void charge();
   }
   class Robot implements Workable,Chargeable{
       @Override
       public void work() {
           System.out.println("机器人在工作");
       }

       @Override
       public void charge() {
           System.out.println("机器人在充电");
       }
   }
   public class Main {
       public static void main(String[] args) {
           Robot robot=new Robot();
           robot.charge();
           robot.work();
       }
}
