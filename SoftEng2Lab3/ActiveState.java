package SoftEng2Lab3;

public class ActiveState implements AccountState
{
    Account account;
    public void activate(Account account)
    {
        System.out.println("Account is already actived!");
    }
    public void suspend(Account account)
    {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }
    public void close(Account account)
    {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
    public void deposit(double amount)
    {
        account.deposit(amount);
        account.toString();
    }
    public void withdraw(double amount)
    {
        account.withdraw(amount);
        account.toString();
    }
}
