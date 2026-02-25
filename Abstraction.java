public class Abstraction {

    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        Abstraction a1 = new Abstraction();
        a1.setBalance(1000.00);
        System.out.println("Balance is : "+a1.balance);
    }
}