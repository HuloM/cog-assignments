package com.cogent.assignments.day03.q5;

import com.cogent.assignments.day03.q5.exceptions.InsufficientFundsException;
import com.cogent.assignments.day03.q5.exceptions.LowBalanceException;
import com.cogent.assignments.day03.q5.exceptions.NegativeAmountException;

public class BankAccount {
    int accNo;
    String custName;
    String accType;
    float balance;

    public BankAccount(int accNo, String custName, String accType, float balance) throws LowBalanceException, NegativeAmountException {
        if (balance < 0) throw new NegativeAmountException();

        if(balance < 1000 && accType.equals("Savings")) throw new LowBalanceException("Your initial balance is less than the minimum of 1000 for a savings account");
        else if(balance < 5000 && accType.equals("Current")) throw new LowBalanceException("Your initial balance is less than the minimum of 5000 for a current account");

        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(float amt) throws NegativeAmountException {
        if (amt < 0) throw new NegativeAmountException();

        this.balance += amt;
        System.out.println("you have successfully deposited " + amt);
    }

    public void withdraw(float amt) throws NegativeAmountException, InsufficientFundsException {
        if (amt < 0) throw new NegativeAmountException();

        if(balance < 1000 && accType.equals("Savings")) throw new InsufficientFundsException();
        else if(balance < 5000 && accType.equals("Current")) throw new InsufficientFundsException();

        this.balance -= amt;
    }

    public float getBalance() throws LowBalanceException, NegativeAmountException {
        if(this.balance < 1000 && this.accType.equals("Savings")) throw new LowBalanceException("Your initial balance is less than the minimum of 1000 for a savings account");
        else if(this.balance < 5000 && this.accType.equals("Current")) throw new LowBalanceException("Your initial balance is less than the minimum of 5000 for a current account");

        return this.balance;
    }
}
