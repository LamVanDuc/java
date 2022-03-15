package session9.bankpkg.accountpkg;

import session9.bankpkg.Bank;
import java.util.Scanner;

public class TesAccount {
    public static void main(String[] args){

        String[] accountDetails = new String[4];
        String[] bankDetails = new String[3];
        //Accept the account details
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountDetails[0] = input.nextLine();

        System.out.print("Enter Name: ");
        accountDetails[1] = input.nextLine();

        System.out.print("Enter Account Type: ");
        accountDetails[2] = input.nextLine();

        System.out.print("Enter Balance: ");
        accountDetails[3] = input.nextLine();



        // Accept the bank details
        System.out.print("Enter Bank ID: ");
        bankDetails[0] = input.nextLine();

        System.out.print("Enter Bank Name: ");
        bankDetails[1] = input.nextLine();

        System.out.print("Enter Branch: ");
        bankDetails[2] = input.nextLine();


        System.out.println("---------------------------------------------------------");

        Account objAccount1 = new Account();

        objAccount1.AddAccount(accountDetails);

        objAccount1.DisplayAccount();


        System.out.println("\n------------------------------------------------------------");
        Bank objBank1 = new Bank();

        objBank1.addBankDetails(bankDetails);

        objBank1.displayBankDetails();

        System.out.println("\n------------------------------------------------------------");

    }
}
