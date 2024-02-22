package SoftEng2Lab3;

public class ActiveState implements AccountState
{
    public void activate(Account account)
    {
        System.out.println("Account is already activated!");
    }
    public void suspend(Account account)
    {
        Account.suspend(this);
    }
    public void close(Account account)
    {
        Account.close(this);
    }
}
