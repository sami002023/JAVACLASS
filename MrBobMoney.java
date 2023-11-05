class BankAccount {double principal;double rate; int time;

    public BankAccount(double principal, double rate, int time){

    }

    public double calculateSimpleInterest() {
        return (principal * rate * time) / 100;
    }

    public double calculateCompoundInterest() {
        double amount = principal * Math.pow(1 + rate / 100, time);
        return amount - principal;
    }
}

public class MrBobMoney {
    public static void main(String[] args) {
        double depositPrincipal = 100000; double depositRate = 5; int depositTime = 5;
        

        double loanPrincipal = 500000; 
        double loanRate = 18; 
        int loanTime = 3; 


        BankAccount depositAccount = new BankAccount(depositPrincipal, depositRate, depositTime);
        double simpleInterest = depositAccount.calculateSimpleInterest();
        System.out.println("Simple Interest is : " + simpleInterest + " RWF");

        BankAccount loanAccount = new BankAccount(loanPrincipal, loanRate, loanTime);
        double compoundInterest = loanAccount.calculateCompoundInterest();
        System.out.println("Total Amount Paid for Loan with Compound Interest: " + (loanPrincipal + compoundInterest) + " RWF");
    }
}