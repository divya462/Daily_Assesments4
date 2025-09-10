/ * 
3. Create a class named BankAccount that encapsulates the details of a bank account. Implement methods for deposit & withdraw money from bank.
*/
import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: $" + balance);
    }
}

public class BankTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(name, balance);

        account.displayBalance();

        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.print("Enter withdraw amount: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        account.displayBalance();
    }
}
