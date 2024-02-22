// Account.java
package SoftEng2Lab3;

public class Account {
    private double amount;
    private String accountNumber;
    private AccountState state;

    public Account(String accountNumber, double amount) {
        setState(new ActiveState());
        setAccountNumber(accountNumber);
        setAmount(amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBalance(double toAdd) {
        amount += toAdd;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void activate() {
        state.activate(this);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void close() {
        state.close(this);
    }

    public void deposit(double amountToAdd) {
        state.deposit(this, amountToAdd);
    }

    public void withdraw(double amountToSub) {
        state.withdraw(this, amountToSub);
    }

    @Override
    public String toString() {
        return accountNumber + "'s current balance = " + amount;
    }
}
