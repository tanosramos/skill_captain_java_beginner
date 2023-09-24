import java.util.Scanner;

public class largerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is Larger!");
        } else {
            System.out.println(secondNumber + " is larger!");
        }
    }
}