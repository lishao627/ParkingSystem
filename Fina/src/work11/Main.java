package work11;
interface People {
    void doSomething();

    default void sleep() {
        System.out.println("人在睡大觉");
    }
}
    class Robot implements People{
        @Override
        public void doSomething() {
            System.out.println("人机");
        }
    }

public class Main {
    public static void main(String[] args) {
        Robot robot=new Robot();
        robot.doSomething();
        robot.sleep();
    }
}