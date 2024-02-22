package SoftEng2Lab3;

public class ClosedState implements AccountState
{
    public void activate(Account account)
    {
        System.out.println("Account is already closed!");
    }
    public void suspend(Account account)
    {
        System.out.println("Account is already closed!");
    }
    public void close(Account account)
    {
        System.out.println("Account is already closed!");
    }
    public void deposit(double amount, Account account)
    {
        System.out.println("Account is already closed!");
    }
    public void withdraw(double amount, Account account)
    {
        System.out.println("Account is already closed!");
    }
}
