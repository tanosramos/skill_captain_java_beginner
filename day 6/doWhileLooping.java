import java.util.Scanner;

public class doWhileLooping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Finally, write a program that uses a do-while loop to prompt the user to
        // enter a number between 1 and 10, and keeps prompting until a valid number is
        // entered.
        // Once a valid number is entered, the program should print out a message that
        // says "You entered [number]."

        System.out.println("Enter a number between 1 and 10");
        int count = Integer.valueOf(scan.nextLine());

        do {
            System.out.println("You entered number " + count);
            count++;
        } while (count <= 10);
    }
}
