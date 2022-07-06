import java.util.Scanner;

public class Ex06_Hypotenuse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double length1 = 0, length2 = 0, hyp = 0;

        System.out.println("Enter the first length: ");
        length1 = sc.nextDouble();
        System.out.println("Enter the second length: ");
        length2 = sc.nextDouble();

        hyp = Math.sqrt((length1*length1)+(length2*length2));
        System.out.printf("The length of the hypotenuse is %.2f%n", hyp);
    
        sc.close();
    }
}
