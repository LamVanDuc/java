package Session5;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        // declares the variables
        int num;
        long fact = 1;
        //create the object of scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for factorial calculation: ");
        num = input.nextInt();

        // Iterates the loop until num evaluates to false

        do{
            fact *= num;
            num --;
        }while (num>=1);


        System.out.println("Factorial of a Number: "+fact);
    }

}
