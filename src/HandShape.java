/*
Enum that will allow user to select one of possible options of hand shape
 */
public enum HandShape {
    ROCK(1),
    PAPER(2),
    SCISSORS(3),
    LIZARD(4),
    SPOC(5);

    private final int selection;

    HandShape(int selection) {
        this.selection = selection;
    }

    public static HandShape getHandShape(int selection) {
        for (HandShape element : values()) {
            if (selection == element.selection) {
                return element;
            }
        }
        return null;
    }

}
