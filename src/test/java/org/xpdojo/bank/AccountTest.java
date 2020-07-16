package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void newAccountShouldHaveZeroBalance() {
        Account account=new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void depositAnAmountToIncreaseBalance(){
        Account account=new Account();
        account.deposit(10);
        assertThat(account.balance()).isEqualTo(10);
    }

    @Test
    public void depositMultiAmountsToIncreaseBalance(){
        Account account=new Account();
        account.deposit(10);
        account.deposit(20);
        assertThat(account.balance()).isEqualTo(30);
    }

    @Test
    public void withdrawAnAmoountToDecreaseBalance(){
        Account account = new Account();
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(-10);
    }

    @Test
    public void transferAmountBetweenTwoAccounts(){
        Account accountA = new Account();
        accountA.deposit(10);
        Account accountB = new Account();
        accountB.transfer(accountA, 10);
        assertThat(accountA.balance()).isEqualTo(0);
        assertThat(accountB.balance()).isEqualTo(10);
    }

    @Test
    @Disabled
    public void printBalanceSlipIncludingDateTime(){

    }
}
