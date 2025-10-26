package work1;

public class Checking extends Account {
    protected double overdraftLimit;
    public Checking(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }


    public String toString() {
        return "Checking账户 ID: " + +getID()+
                ", 余额: " + getBalance() +
                ", 透支限额: " + overdraftLimit +
                ", 开户日期: " + getDeteCteated();
    }
}
