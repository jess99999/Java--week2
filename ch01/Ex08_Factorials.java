import java.util.Scanner;

public class Ex08_Factorials {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int factorial = 1;

        System.out.println("Enter a number: ");
        input = sc.nextInt();

        for (int i = input; i > 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);

        sc.close();
    }
}