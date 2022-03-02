import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DisplayRules {
    public static void displayRules() {
        File file = new File("src/Rules.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
