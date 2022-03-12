package Session7;

public class TestAccount {
    public static void main(String[] args){

        Account ObjAccount1;
        ObjAccount1 = new Account();

        System.out.println("Account Number : " + ObjAccount1.AccountNumber);
        System.out.println("Account Holder Name : " + ObjAccount1.AccountHolderName);
        System.out.println("Account Type : " + ObjAccount1.AccountType);
        System.out.println("Account Balance : " + ObjAccount1.Balance);
        System.out.println("--------------------------------------------------------------");

        //constructors

       Account ObjAccount2 = new Account("Acc001","Jone Smitch" , "Savings" , 6500.789);

        System.out.println("Account Number : " + ObjAccount2.AccountNumber);
        System.out.println("Account Holder Name : " + ObjAccount2.AccountHolderName);
        System.out.println("Account Type : " + ObjAccount2.AccountType);
        System.out.println("Account Balance : " + ObjAccount2.Balance);
        System.out.println("--------------------------------------------------------------");


        // getter and setter

        Account ObjAccount3 = new Account();
        ObjAccount3.setAccountNumber("Acc003");
        ObjAccount3.setAccountHolderName("John Smith");
        ObjAccount3.setAccountType("Savings");
        ObjAccount3.setBalance(54147.45);
        // display

        System.out.println("Account Number : " + ObjAccount3.getAccountNumber());
        System.out.println("Account Holder Name : " + ObjAccount3.getAccountHolderName());
        System.out.println("Account Type : " + ObjAccount3.getAccountType());
        System.out.println("Account Balance : " + ObjAccount3.getBalance());

        //display with function
        Account ObjAccount4 = new Account();
        ObjAccount4.setAccountNumber("Acc004");

        ObjAccount4.DisplayAccount();
    }
}
