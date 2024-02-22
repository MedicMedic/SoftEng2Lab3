package SoftEng2Lab3;

public class ActiveState implements AccountState
{
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
    public void deposit(double amount, Account account)
    {
        account.setBalance(amount);
        String text = account.toString();
        System.out.println(text);
    }
    public void withdraw(double amount, Account account)
    {
        account.setBalance(amount);
        String text = account.toString();
        System.out.println(text);
    }
}
