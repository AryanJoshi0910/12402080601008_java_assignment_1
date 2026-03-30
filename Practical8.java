class InsufficientFundsException extends Exception {
    InsufficientFundsException(double amount) {
        super("Insufficient funds. Requested: " + amount);
    }
}

class Bank {
    double balance;
    Bank(double balance) { this.balance = balance; }

    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException(amount);
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

public class A1P8 {
    public static void main(String[] args) {
        Bank b = new Bank(3000);
        try { b.withdraw(1000); } catch (InsufficientFundsException e) { System.out.println(e.getMessage()); }
        try { b.withdraw(5000); } catch (InsufficientFundsException e) { System.out.println(e.getMessage()); }
    }
}
