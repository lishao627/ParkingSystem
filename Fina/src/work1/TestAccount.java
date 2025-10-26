package work1;
public class TestAccount {
    public static void main(String[] args) {
        Account.setRate(0.045);
        Checking checking = new Checking(12345, 1000, 500);
        checking.deposit(500);
        System.out.println("存款500后余额: " + checking.getBalance());
        checking.withdraw(2000);
        System.out.printf("月利息: %.2f%n", checking.getMonthlyInterest());
        System.out.println(checking);
    }

}
