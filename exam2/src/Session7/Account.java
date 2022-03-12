package Session7;

public class Account {

    String AccountNumber;
    String AccountHolderName;
    String AccountType;
    double Balance;

    public Account(){
        System.out.println("Default constructor Invocked...");
        AccountNumber = "Not Specified";
        AccountHolderName ="Not Specified" ;
        AccountType = "Not Specified";
        Balance = 0.0;

    }
    public Account(String number , String name , String type , double balance){
        System.out.println("Default constructor Invocked...");
        this.AccountNumber = number;
        this.AccountHolderName = name;
        this.AccountType = type;
        this.Balance = balance;
    }

    //getter and setter

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.AccountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        this.AccountType = accountType;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    // display account
    public void DisplayAccount(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Account Number :" + AccountNumber);
        System.out.println("Account Holder Name :" + AccountHolderName);
        System.out.println("Account Number :" + AccountType);
        System.out.println("Account Number :" + Balance);

    }
}
