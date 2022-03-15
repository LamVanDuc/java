package session10;

import session9.bankpkg.accountpkg.Account;
import session9.bankpkg.Bank;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

import session9.bankpkg.iTransasion;
public class SavingsAccount extends Account implements iTransasion{

    private double dailyInterest;
    private int daysOfYear;

    public SavingsAccount(String accountNumber, String accountHolderName , String accountType , double balance , int daysOfYear){
        super(accountNumber, accountHolderName , accountType , balance);
        this.daysOfYear = daysOfYear;
    }

    public double calculateInterest(){
        dailyInterest = (super.getBalance() * Bank.interestRate/100 ) / daysOfYear;

        DecimalFormat twoDForm = new DecimalFormat("#.00");

        return new Fomatter().decimalFormat(dailyInterest);
    }

    @Override
    public void DisplayAccount2(){
        super.DisplayAccount2();
        System.out.println("dailyInterest : $"+calculateInterest());
        System.out.println("------------------------------------------------------------");
    }
    // interface iTransaction
    @Override
    public void checkBalance(String accountNumber) {
        System.out.println("------------------------------------------------------------");
        System.out.println("Available  balance : $" + super.getBalance());
        System.out.println("------------------------------------------------------------");
    }

    @Override
    public void depositCash(String accountNumber, double amount) {
        super.setBalance(super.getBalance() + amount);

        Calendar objNow = Calendar.getInstance();

        SimpleDateFormat objFormat = new SimpleDateFormat("dd//MM/yyyy HH:mm:ss");

        System.out.println("Date-Time: "+ objFormat.format(objNow.getTime()));

        System.out.println("Amount depsited: $"+ amount);
        System.out.println("Balance after deposit: $"+super.getBalance());
        System.out.println("--------------------------------------------------------");

    }

    @Override
    public void withdrawCash(String accountNumber, double amount) {
        super.setBalance(super.getBalance() -amount);

        Calendar objNow = Calendar.getInstance();

        System.out.println("Date-Time: "+ new Fomatter().fomatDate());
        System.out.println("Amount depsited: $"+ amount);
        System.out.println("Balance after deposit: $"+super.getBalance());
        System.out.println("--------------------------------------------------------");

    }



    class Fomatter{
        public String fomatDate(){
            Calendar objNow = Calendar.getInstance();

            SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            return objFormat.format(objNow.getTime());
        }

        public double decimalFormat(double value){
            DecimalFormat twoForm = new DecimalFormat("#.00");
            return value;
        }
    }

}
