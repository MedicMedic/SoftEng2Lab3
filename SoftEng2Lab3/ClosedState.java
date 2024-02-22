package SoftEng2Lab3;

public class ClosedState implements AccountState
{
    Account account;
    public void activate(Account account)
    {
        System.out.println("You cannot activate a closed account!");
    }
    public void suspend(Account account)
    {
        System.out.println(" You cannot suspend a closed account");
    }
    public void close(Account account)
    {
        System.out.println("Account is already closed!");
    }
    public void deposit(double amount)
    {
        System.out.println("You cannot deposit on closed account!");
        account.toString();
    }
    public void withdraw(double amount)
    {
        System.out.println("You cannot withdraw on a closed account!");
        account.toString();
    }
}
