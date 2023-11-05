public class BankAccount {
    class BankAccount {
    private double principal;
    private double rate;
    private int years;

    public BankAccount(double principal, double rate, int years) {
        principal = principal;
        rate = rate;
        years = years;
    }

    public double calculateSimpleInterest() {
        return (principal * rate * years) / 100;
    }
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 100000;  // Principal amount in RWf
        double rate = 5.0;         // Annual interest rate in %
        int years = 5;            // Number of years

        BankAccount account = new BankAccount(principal, rate, years);
        double simpleInterest = account.calculateSimpleInterest();

        System.out.println("The simple interest for Mr. Bob is: " + simpleInterest + " RWf");
    }
}

}
