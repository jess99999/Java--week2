import java.util.Scanner;

public class Ex10_ReverseInput {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        String reverseInput = "";

        System.out.println("Write a message: ");
        userInput = sc.nextLine();

        for (int i = userInput.length() - 1; i >= 0; i--) {
            reverseInput += userInput.charAt(i);
        }
    
        System.out.println(reverseInput);

        sc.close();
    }

}
