import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Movie> top10 = new ArrayList<>();

        top10.add(new Movie(1, "Marcel the Shell with Shoes On", "Dean Fleischer-Camp", 100));
        top10.add(new Movie(2, "Fire of Love", "Sara Dosa", 100));
        top10.add(new Movie(3, "Playground", "Laura Wandel", 100));
        top10.add(new Movie(4, "Writing with Fire", "Rintu Thomas, Sushmit Ghosh", 100));
        top10.add(new Movie(5, "The Janes", "Tia Lessin, Emma Pildes", 100));
        top10.add(new Movie(6, "Happening", "Audrey Diwan", 99));
        top10.add(new Movie(7, "Navalny", "Alexei Navalny", 99));
        top10.add(new Movie(8, "Poly Styrene: I am a Cliche", "Celeste Bell, Paul Sneg", 98));
        top10.add(new Movie(9, "The Automat", "Lisa Hurwitz", 98));
        top10.add(new Movie(10, "Who We Are: A Chronicle of Racism in America", "Emily Kunstler, Sarah Kunstler", 98));

        Scanner sc = new Scanner(System.in);
        int userInput = 0;

        System.out.println("Enter a number from 1-10: ");
        userInput = sc.nextInt();

        if (userInput >=1 && userInput <=10) {
            System.out.println(top10.get(userInput - 1));
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
