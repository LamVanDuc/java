package Session4;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
//     declares variables
        int employeeID;
        String employeeName;
        char gender;

//    Creates an instanse of Scanner class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Employee Identification Code : ");
        employeeID = input.nextInt();
        if (employeeID > 0) {
            System.out.println("Enter the Employee Name : ");
            Scanner in = new Scanner(System.in);
            employeeName = in.nextLine();

            if (employeeName.length() < 40) {
                System.out.println("Enter the Gender :   [M/F] ");
                gender = input.next("\\D").charAt(0);

                if (gender == 'M' || gender == 'F') {
                    System.out.println("Employee Code: " + employeeID);
                    System.out.println("Employee Name: " + employeeName);
                    System.out.println("Employee Gender: " + gender);
                }
            }
        }
    }
}
