import java.util.Scanner;
import java.util.ArrayList;

public class Ex05_AverageCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        ArrayList<Double> numList = new ArrayList<Double>();

        System.out.println("Enter a number or press = ");
        input = sc.next();

        while (!input.equals("=")) {
            Double nextNum = Double.parseDouble(input);
            numList.add(nextNum);
            System.out.println("Enter a number or press = ");
            input = sc.next();
        }

        double sum = 0;
        double average = 0;

        for (double i : numList) {
            sum += i;
        }

        average = sum / numList.size();

        System.out.printf("Your average is %.2f%n", average);
        
        sc.close();
    }
}
