import java.util.Scanner;

public class Ex02_CountToN {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int stopNum = 0;

        System.out.println("How high should I count?");
        stopNum = sc.nextInt();

        for (int i = 1; i <= stopNum; i++) {
                System.out.println(i);
        }

        sc.close();
    }
}
