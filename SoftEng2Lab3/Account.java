package SoftEng2Lab3;

public class Account
{
    private AccountState state;

    //activate
    public Account() 
    {
        state = null;
    }

    public AccountState getState()
    {
        return state;
    }

    public void activate(AccountState state) 
    {
        this.state = new ActiveState();
    }

    public void suspend(AccountState state)
    {
        this.state = new SuspendedState();
    }

    public void close(AccountState state) 
    {
        this.state = new ClosedState();
    }
}
