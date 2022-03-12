package Session7.Session6.accountpkg;

public class TestAccount {
    public static void main(String[] args){
        Account ObjAccount1;
        ObjAccount1 = new Account();

        System.out.println("Account Number : " + ObjAccount1.AccountNumber);
        System.out.println("Account Holder Name : " + ObjAccount1.AccountHolderName);
        System.out.println("Account Type : " + ObjAccount1.AccountType);
        System.out.println("Account Balance : " + ObjAccount1.Balance);
    }
}
