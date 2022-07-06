import java.util.Scanner;

public class Ex04_SumToN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int stopNum = 0;
        int sum = 0;

        System.out.println("Enter a number: ");
        stopNum = sc.nextInt();

        for (int i = 1; i <= stopNum; i++) {
            sum += i;
            System.out.println(sum);
        }
        sc.close();
    }
}
