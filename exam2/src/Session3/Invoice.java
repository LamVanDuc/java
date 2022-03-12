package Session3;

import java.sql.Statement;
import java.util.Scanner;

public class Invoice {
    public static void main(String[] args){
        int orderedShirts , orderedTrousers , points = 0;
        int priceOfShirt = 300;
        int priceOfTrouser = 700;
        int cosOfTrousers , costOfShirts , totalCost;
        double discount , netPay;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of Shirts to order: ");
        orderedShirts = input.nextInt();
        System.out.println("Enter the number of Trousers to order: ");
        orderedTrousers = input.nextInt();

        costOfShirts = priceOfShirt * orderedShirts;
        cosOfTrousers = priceOfTrouser * orderedTrousers;
        totalCost = costOfShirts + cosOfTrousers ;


        discount = totalCost > 3000 ? totalCost *10 /100 : 0;
        netPay = totalCost - discount;
//        gives one percent of the netPay as points if it exceeds $3000
        points = (int) (netPay > 3000 ? netPay / 100 : 0);


//        display the invoice detail
        System.out.println("\nItem \t\t Quantity \t\t Price \t\t Total");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Shirts   \t\t %d \t\t %d \t\t %d \n", orderedShirts , priceOfShirt , costOfShirts);
        System.out.printf("Trousers \t\t %d \t\t %d \t\t %d \n",orderedTrousers , priceOfTrouser , cosOfTrousers);

        System.out.printf("Discount \t \t\t \t\t\t\t\t %.2f \n", discount);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Net total \t \t\t \t\t\t\t\t %.2f \n",netPay);
        System.out.println("--------------------------------------------------------------");
        System.out.printf("Points Earned: \t %d \n",points);
    }
}
