package session10;

import session9.bankpkg.Bank;
import java.util.Scanner;
import session9.bankpkg.accountpkg.Account;

import static java.lang.Double.parseDouble;

public class TesAccount {
    public static void main(String[] args){

        String[] accountDetails = new String[5];
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

        System.out.print("Enter Number of days: ");
        accountDetails[4] = input.nextLine();




        // Accept the bank details
        System.out.print("Enter Bank ID: ");
        bankDetails[0] = input.nextLine();

        System.out.print("Enter Bank Name: ");
        bankDetails[1] = input.nextLine();

        System.out.print("Enter Branch: ");
        bankDetails[2] = input.nextLine();

        SavingsAccount objAccount2 = new SavingsAccount(accountDetails[0],
                                                 accountDetails[1],
                                                 accountDetails[2],
                                                 Double.parseDouble(accountDetails[3]),
                                                 Integer.parseInt(accountDetails[4]));
        System.out.println("---------------------------------------------------------");

        // Display account
        objAccount2.DisplayAccount2();


        //bank
        Bank objBank1 = new Bank();

        //add bank
        objBank1.addBankDetails(bankDetails);

        //display bank
        objBank1.displayBankDetails();

        System.out.println("\n------------------------------------------------------------");
        objAccount2.checkBalance(accountDetails[0]);
        System.out.print("Enter Deposit Amount: ");
        double deposit  = Double.parseDouble(input.nextLine());

        objAccount2.depositCash(accountDetails[0],deposit );

        System.out.print("Enter Withdraval Amount: ");
        double withdraw = Double.parseDouble(input.nextLine());
        objAccount2.withdrawCash(accountDetails[0], withdraw );

    }
}
