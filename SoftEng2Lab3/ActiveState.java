// ActiveState.java
package SoftEng2Lab3;

public class ActiveState implements AccountState {
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }

    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }

    public void deposit(Account account, double amount) {
        account.setBalance(amount);
        System.out.println(account.toString());
    }

    public void withdraw(Account account, double amount) {
        if (amount <= account.getAmount()) {
            account.setBalance(-amount);
            System.out.println(account.toString());
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}
