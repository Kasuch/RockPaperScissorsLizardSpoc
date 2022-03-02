import java.util.Scanner;

public class UserAction {
    public static int userAction() {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        HandShape[] handShapes = HandShape.values();

        do {
            System.out.println("Select your option:");
            for (int i = 0; i < handShapes.length; i++) {
                System.out.println("[" + (i + 1) + "] " + handShapes[i]);
            }
            userChoice = scanner.nextInt();
        } while (userChoice < 1 || userChoice > 5);

        System.out.println("You've selected: " + HandShape.getHandShape(userChoice));
        return userChoice;
    }
}
