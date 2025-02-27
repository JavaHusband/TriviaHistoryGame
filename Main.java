import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String Question1 = "Qin-Shi-Huang";

        String Question2 = "Liu-Bang";

        String Question3 = "Sun Tzu";

        int score = 0;

        System.out.println("Welcome to TRIVIA HISTORY GAME!");

        System.out.println("Who was the first emperor of China?");

        Scanner scanner = new Scanner(System.in);

        // Question1
        System.out.println(Question1 +"\n"+ Question2 +"\n"+ Question3);
        
        String input1 = scanner.nextLine();

        if (input1.equals(Question1)) {
            score++;
            System.out.println("of you choose A then you're right it's Qin Shi Huang! " + "Points " + score);

        } else if (input1.equals(Question2)) {
            System.out.println("BOO! POINTS TAKEN AWAY " + "Points " + score);

        } else if (input1.equals(Question3)) {
            System.out.println("BOO! POINTS TAKEN AWAY " + "Points " + score);
        }
    }
}