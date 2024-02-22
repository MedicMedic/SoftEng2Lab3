package SoftEng2Lab3;

public interface AccountState 
{
    public void deposit(Account account);
    public void withdraw(Account account);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}
