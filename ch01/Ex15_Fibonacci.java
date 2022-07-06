import java.util.Scanner;

public class Ex15_Fibonacci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int userInput = 0, lastNum = 1, otherLastNum = 1;

        System.out.println("Enter a number: ");
        userInput = sc.nextInt();

        if (userInput >= 1) {
            System.out.println("1");
        }

        if (userInput >= 2) {
            System.out.println("1");
        }

        if (userInput >= 3) {
            for (int i = 3; i <= userInput; i++) {
                int nextNum = lastNum + otherLastNum;
                System.out.println(nextNum);
                lastNum = otherLastNum;
                otherLastNum = nextNum;
            }
        }

        sc.close();
    }
}
