import java.util.Scanner;

public class Ex09_HighestAndLowest {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int[] numList = new int[7];
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter a number: ");
            input = sc.nextInt();
            numList[i] = input;
        }

        int max = numList[0];
        int min = numList[0];

        for (int i : numList) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("The highest number is " + max + " and the lowest is " + min);
        
        sc.close();
    }
}
