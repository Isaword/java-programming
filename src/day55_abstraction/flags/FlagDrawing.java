package day55_abstraction.flags;

public class FlagDrawing {
    public static void main(String[] args) {
        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        UkranianFlag ukranianFlag = new UkranianFlag();
        ukranianFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();
    }
}