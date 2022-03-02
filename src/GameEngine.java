public class GameEngine {
    public static void gameEngine() {
        int userScore = 0;
        int computerScore = 0;

        while (userScore < 3 && computerScore < 3) {
            int user = UserAction.userAction();
            int comp = ComputerAction.computerAction();
            if (user == comp) {
                System.out.println("It's a tie");
                System.out.println();
            } else if ((user == 1 && comp == 3) ||
                    (user == 1 && comp == 4) ||
                    (user == 2 && comp == 1) ||
                    (user == 2 && comp == 5) ||
                    (user == 3 && comp == 2) ||
                    (user == 3 && comp == 4) ||
                    (user == 4 && comp == 2) ||
                    (user == 4 && comp == 5) ||
                    (user == 5 && comp == 1) ||
                    (user == 5 && comp == 3)
            ) {
                userScore++;
                System.out.println("You win this round!");
                System.out.println("User  " + userScore + ":" + computerScore + "  Computer");
                System.out.println();
            } else {
                computerScore++;
                System.out.println("You lost this round!");
                System.out.println("User  " + userScore + ":" + computerScore + "  Computer");
                System.out.println();
            }
        }
        if (userScore > computerScore) {
            System.out.println("YOU ARE A WINNER!");
        } else {
            System.out.println("YOU ARE A LOSER");
        }
    }
}
