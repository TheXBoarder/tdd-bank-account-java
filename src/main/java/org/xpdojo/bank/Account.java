package org.xpdojo.bank;

public class Account {
    // change something to see if git push is possible...
    private int balance;

    public int balance() {
        return this.balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
