package SoftEng2Lab3;

public interface AccountState 
{
    public void deposit(double amount, Account account);
    public void withdraw(double amount, Account account);
    public void activate(Account account);
    public void suspend(Account account);
    public void close(Account account);
}
