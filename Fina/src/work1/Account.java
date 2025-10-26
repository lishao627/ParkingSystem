package work1;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private static double rate = 0;
    private Date deteCteated;

    public Account() {
        this(0, 0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.deteCteated = new Date();

    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }


    public static void setRate(double newRate) {
        rate = newRate;
    }

    public Date getDeteCteated() {
        return deteCteated;
    }

    public double getMonthlyInterest() {
        return balance * (rate / 12);
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("取款失败: 金额无效或余额不足");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("存款失败: 金额无效");
        }
    }

}
