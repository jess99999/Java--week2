import java.util.Scanner;

public class Ex13_ConvertToCelsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double userInput = 0, celsius = 0;

        System.out.println("Enter the temp in F: ");
        userInput = sc.nextDouble();

        celsius = (userInput - 32) * 5 / 9;

        System.out.printf("That is %.2f degrees in Celsius!%n", celsius);

        sc.close();
    }
}