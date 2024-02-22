package SoftEng2Lab3;

public class SuspendedState implements AccountState
{
    public void activate(Account account)
    {
        Account.activate(this);
    }
    public void suspend(Account account)
    {
        System.out.println("Account is already suspended!");
    }
    public void close(Account account)
    {
        Account.close(this);
    }
}
