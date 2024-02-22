// SuspendedState.java
package SoftEng2Lab3;

public class SuspendedState implements AccountState {
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
    }

    public void deposit(Account account, double amount) {
        System.out.println("Account is suspended, cannot deposit!");
    }

    public void withdraw(Account account, double amount) {
        System.out.println("Account is suspended, cannot withdraw!");
    }
}
