package Session7.Session6.constructors;

public class Account {
    String AccountNumber;
    String AccountHolderName;
    String AccountType;
    double Balance;

    public Account(){

    }
    public Account(String number , String name , String type , double balance){
        this.AccountNumber = number;
        this.AccountHolderName = name;
        this.AccountType = type;
        this.Balance = balance;
    }
}
