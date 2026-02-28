class Bank {
    private double balance, rate;
    Bank(double b, double r){
        balance = b;
        rate = r;
    }

    void display(){
        Interest in = new Interest();
        System.out.println("Before Calculating Interest, Balance is : "+balance);
        in.calculateInterest();
        System.out.println("After Calculating Interest, Balance is : "+balance);
    }

    class Interest {
        void calculateInterest() {
            double interest = balance*rate/100;
            System.out.println("Interest is : "+interest);
            balance = balance + interest;
        }
    }
}

public class InnerDemo {

    public static void main(String args[]) {
        Bank b1 = new Bank(1000, 3);
        b1.display();
    }
}