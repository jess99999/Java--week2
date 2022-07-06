import java.util.Scanner;

public class Ex14_NumberOfVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        int numOfVowels = 0;

        System.out.println("Enter a phrase: ");
        userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            char c = userInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numOfVowels++;
            }
        }     
        
        System.out.println("There were " + numOfVowels + " vowels in that phrase!");

        sc.close();
    }
}
