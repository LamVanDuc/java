package Session5;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args){
       Scanner input =new Scanner(System.in);
       int row;
        System.out.println("Enter the  row:");
        row = input.nextInt();

       for (int i = 1 ; i <= row ; i++){
           for (int k = row ; k >= i ; k--){
               System.out.print(" ");
           }
           for (int j = 1 ; j <= i ; j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
