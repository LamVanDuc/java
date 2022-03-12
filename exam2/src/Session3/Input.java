package Session3;
// import Scanner
import java.util.Scanner;

public class Input {
//  input data declaration
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String Name;
    int Age;

//  Enter the value;

    System.out.println("Enter the name");
    Name = input.nextLine();


    System.out.println("Enter the number");
    Age = input.nextInt();

//  Display

    System.out.println("Name \t\t\t  Age");
    System.out.printf("%s \t\t  %d",Name , Age);



//


    }
}
