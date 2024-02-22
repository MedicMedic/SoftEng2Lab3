// ClosedState.java
package SoftEng2Lab3;

public class ClosedState implements AccountState {
    public void activate(Account account) {
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    public void close(Account account) {
        System.out.println("Account is already closed!");
    }

    public void deposit(Account account, double amount) {
        System.out.println("You cannot deposit to a closed account!");
        System.out.println(account.toString()); // Print current balance and account number
    }

    public void withdraw(Account account, double amount) {
        System.out.println("You cannot withdraw from a closed account!");
        System.out.println(account.toString()); // Print current balance and account number
    }
}
