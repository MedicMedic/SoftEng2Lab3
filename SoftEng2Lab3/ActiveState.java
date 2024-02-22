package SoftEng2Lab3;

public class ActiveState implements AccountState
{
    public void activate(Account account)
    {
        System.out.println("Account is already active!");
    }
    public void suspend(Account account)
    {
        account.setState(new SuspendedState());
    }
    public void close(Account account)
    {
        account.setState(new ClosedState());
    }
    public void deposit(double amount, Account account)
    {
        account.setBalance(amount);
    }
    public void withdraw(double amount, Account account)
    {
        account.setBalance(amount);
    }
}
