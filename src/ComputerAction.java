import java.util.Random;
/*
Class responsible for random selection of hand shape by computer player
 */
public class ComputerAction {
    public static int computerAction() {
        int computerChoice;
        Random random = new Random();
        computerChoice = random.nextInt(5);
        System.out.println("Your opponent selected: " + HandShape.getHandShape(computerChoice + 1));
        return computerChoice + 1;
    }
}
