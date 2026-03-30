class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) System.out.println("Insufficient funds");
        else { balance -= amount; System.out.println("Withdrawn: " + amount); }
    }

    void inquiry() {
        System.out.println("Balance of " + owner + ": " + balance);
    }
}

public class A1P4 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Aryan", 5000);
        acc.inquiry();
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.withdraw(9000);
        acc.inquiry();
    }
}
