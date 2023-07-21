// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /*String firstName = "Fergus";
       String secondName = "Smith";

       String name = firstName + secondName;
       System.out.println(name);
       */
        /*
        int num1 = 100;
        int num2 = 300;
        System.out.println(num1 + num2);
        int result = num1 / num2;
        int num3 = 8;
        System.out.println(num3++);
        System.out.println(num3);
        System.out.println(++num3);
        */
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = s.nextLine();
        System.out.println("Please enter your second name");
        String secondName = s.nextLine();

        System.out.println("Hello to you, " + firstName + secondName);

        System.out.println("Please give me two numbers. Number 1:");
        int firstNumber = s.nextInt();
        System.out.println("Number 2:");
        int secondNumber = s.nextInt();

        System.out.println("The sum of your two numbers is: " + (firstNumber + secondNumber));
    }
}

/*
 */