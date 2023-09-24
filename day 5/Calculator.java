// Example :
// Enter first number: 10
// Enter second number: 5
// Enter operation (+, -, *, /): +

// Output : 
// 10 + 5 = 15
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.print("Enter second number: ");
        int secondNumber = Integer.valueOf(scan.nextLine());
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scan.nextLine();

        if (operation.equals("+")) {
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        } else if (operation.equals("-")) {
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
        } else if (operation.equals("*")) {
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
        } else if (operation.equals("/")) {
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
        } else {
            System.out.println("Error! try again.");
        }

        scan.close();
    }
}