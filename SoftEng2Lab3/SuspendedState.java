package SoftEng2Lab3;

public class SuspendedState implements AccountState
{
    public void activate(Account account)
    {
        account.setState(new ActiveState());
    }
    public void suspend(Account account)
    {
        System.out.println("Account is already suspended!");
    }
    public void close(Account account)
    {
        account.setState(new ClosedState());
    }
    public void deposit(double amount, Account account)
    {
        System.out.println("Account is already suspended!");
    }
    public void withdraw(double amount, Account account)
    {
        System.out.println("Account is already suspended!");
    }
}
