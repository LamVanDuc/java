package session9.bankpkg;
import java.util.ArrayList;
import java.util.Iterator;
public class Bank {

    String bankID ;
    String bankName;
    String branch;

    // declare and instantiate an ArrayList
    private ArrayList bankDetail = new ArrayList();

    // Declare and initialize a static final variable to store interest
    public static final float interestRate = 3.5f;

    // No argument constructor . Initializes the variables to default values.

    public  Bank(){
        bankID = "Not Specified";
        bankName = "Not Specified";
        branch = "Not Specified";
    }

    public Bank(String bankID , String bankName, String branch){
        this.bankID = bankID ;
        this.bankName = bankName;
        this.branch = branch;
    }

    public void addBankDetails (String[] details){
        System.out.println("Adding Bank Details. Please wait...");

        // copy array to ArrayList for loop

        for (int i=0 ; i < details.length ; i++){
            // add array element to ArrayList using add() method
            bankDetail.add(details[i]);
        }
    }
    public void displayBankDetails(){
        System.out.println("Bank Details of Customer");
        System.out.println("Bank ID. Bank Name \t Branch  Interest(%)");
        System.out.println("--------------------------------------------------------\n");

        Iterator iBank = bankDetail.iterator();

        while(iBank.hasNext()){
            System.out.print(iBank.next()+ "  ");
        }
        System.out.print(interestRate);
        System.out.print("");
    }

}
