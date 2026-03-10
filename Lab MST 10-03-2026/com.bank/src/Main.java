import accounts.Account;
import exceptions.InsufficientBalanceException;
import exceptions.InvalidDepositAmountException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Account obj = new Account(101,500);
        Scanner s = new Scanner(System.in);
        int amount;

        System.out.println("Enter Deposit Ammount");
        amount = s.nextInt();
        try{
            obj.deposit(amount);
        }catch(InvalidDepositAmountException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Enter Ammount to withdraw");
        amount = s.nextInt();
        try{
            obj.withdraw(amount);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }

    }
}
