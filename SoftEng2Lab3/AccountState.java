// AccountState.java
package SoftEng2Lab3;

public interface AccountState {
    void activate(Account account);
    void suspend(Account account);
    void close(Account account);
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
}
