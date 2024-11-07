package October.Experiments.Interface;
import java.util.Scanner;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
}

public class BankAccount implements Account {
    double balance = 0.0;

    public void deposit(double d_amount) {
        balance += d_amount;
        System.out.println("Deposited: " + d_amount + ", Balance: " + balance);
    }

    public void withdraw(double w_amount) {
        if (balance >= w_amount) {
            balance -= w_amount;
            System.out.println("Withdrew: " + w_amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    /* // Scanner class outside the main method
      public double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        double depositAmount = ba.getInput("Enter amount to deposit: ");
        ba.deposit(depositAmount);

        double withdrawAmount = ba.getInput("Enter amount to withdraw: ");
        ba.withdraw(withdrawAmount);
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount ba = new BankAccount();

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        ba.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        ba.withdraw(withdrawAmount);
    }
}
