package SoftEng2Lab3;

public interface AccountState 
{
    public void deposit(double amount);
    public void withdraw(double amount);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}
