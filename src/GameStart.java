import java.util.Scanner;

public class GameStart {
    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);
        int selectedOption;

        do {
            System.out.println("What do you want to do?");
            System.out.println("[1] Start new game");
            System.out.println("[2] Read the rules");
            selectedOption = scanner.nextInt();
        } while (selectedOption != 1 && selectedOption !=2);

        if (selectedOption == 1) {
            System.out.println("Let the game begin!");
            System.out.println();
            GameEngine.gameEngine();
        } else {
            DisplayRules.displayRules();
            System.out.println();
        }
    }
}
