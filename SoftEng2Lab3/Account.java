package SoftEng2Lab3;

public class Account
{
    private double amount;
    private String accountNumber;
    private AccountState state;

    public void suspend()
    {
        accountState.suspend(this);
    }
}
