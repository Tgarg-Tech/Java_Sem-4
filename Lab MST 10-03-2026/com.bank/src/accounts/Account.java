package accounts;

import exceptions.InsufficientBalanceException;
import exceptions.InvalidDepositAmountException;

public class Account {
    public int accountNumber;
    private int accountBalance;

    public Account(int accountNumber, int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }


    public void deposit(int amount) throws InvalidDepositAmountException{
        if(amount<0){
            throw new InvalidDepositAmountException("Invalid Deposit amount");
        }
        this.accountBalance += amount;
        System.out.println("Deposit Successfull");
    }

    public  void withdraw(int amount) throws InsufficientBalanceException{
        if(this.accountBalance < amount){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        this.accountBalance -= amount;
        System.out.println("Withdrawl Successfull");
    }
}
