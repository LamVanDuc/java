package session9.bankpkg.accountpkg;

import java.util.ArrayList;
import java.util.Iterator;

public class Account {
    String AccountNumber;
    String AccountHolderName;
    String AccountType;
    double Balance;

    private ArrayList accountDetail = new ArrayList();

    public Account(String accountNumber, String accountHolderName, String accountType, double balance, int daysOfYear){
    }

    public Account(String accountNumber, String accountHolderName, String accountType, double balance) {
        AccountNumber = accountNumber;
        AccountHolderName = accountHolderName;
        AccountType = accountType;
        Balance = balance;
    }

    public Account() {

    }

    public void AddAccount(String[] details){
       System.out.print("Adding Account Details. Please wait...");

       for (int i = 0 ; i< details.length; i++){
           accountDetail.add(details[i]);
       }
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public ArrayList getAccountDetail() {
        return accountDetail;
    }

    public void setAccountDetail(ArrayList accountDetail) {
        this.accountDetail = accountDetail;
    }

    public void DisplayAccount() {
        System.out.println("\nAccount Details of Customer");
        System.out.println("A/c.       Name  \t\t  Type \t Balance");
        System.out.println("-----------------------------------------------------");

        Iterator iAccount = accountDetail.iterator();

        while (iAccount.hasNext()){
            System.out.print( iAccount.next()+"\t");
        }
    }

    public void DisplayAccount2() {
        System.out.println("All Account Details of Customer");
        System.out.println("---------------------------------------------");
        System.out.println("Account Number: " + this.AccountNumber);
        System.out.println("Account Holder: " + this.AccountHolderName);
        System.out.println("Account Type: " + this.AccountType);
        System.out.println("Balance: " + this.Balance);
    }


}
