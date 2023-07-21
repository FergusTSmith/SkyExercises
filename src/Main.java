// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = s.nextLine();
        System.out.println("Please enter your second name");
        String secondName = s.nextLine();

        System.out.println("Hello " + firstName + secondName);

        System.out.println("Please give me two numbers:");
        int firstNumber = s.nextInt();
        int secondNumber = s.nextInt();

        System.out.println("The sum of your two numbers is: " + (firstNumber + secondNumber));
    }
}