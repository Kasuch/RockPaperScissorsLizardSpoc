/*
Game engine - compares hand shapes selected by user and
by computer player and adds points to the winner score count
 */
public class GameEngine {
    public static void gameEngine() {
        int userScore = 0;
        int computerScore = 0;

        //Rounds will be repeated until one player wins 3 rounds
        while (userScore < 3 && computerScore < 3) {
            int user = UserAction.userAction();
            int comp = ComputerAction.computerAction();
            if (user == comp) {
                System.out.println("It's a tie");
                System.out.println();
            } else if ((user == 1 && comp == 3) ||  //rock crushes scissors
                    (user == 1 && comp == 4) ||     //rock crushes lizard
                    (user == 2 && comp == 1) ||     //paper covers rock
                    (user == 2 && comp == 5) ||     //paper disproves Spock
                    (user == 3 && comp == 2) ||     //scissors cuts paper
                    (user == 3 && comp == 4) ||     //scissors decapitates lizard
                    (user == 4 && comp == 2) ||     //lizard eats paper
                    (user == 4 && comp == 5) ||     //lizard poisons Spock
                    (user == 5 && comp == 1) ||     //Spock vaporizes rock
                    (user == 5 && comp == 3)        //Spock smashes scissors
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
        //Game ends after one player reach 3 points - game result is displayed
        if (userScore > computerScore) {
            System.out.println("YOU ARE A WINNER!");
        } else {
            System.out.println("YOU ARE A LOSER");
        }
    }
}
