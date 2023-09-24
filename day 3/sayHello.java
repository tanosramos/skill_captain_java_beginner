import java.util.Scanner;

public class sayHello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = Integer.valueOf(scan.nextLine());
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello, " + name + "!. You are " + age + " years old.");

        scan.close();
    }
}