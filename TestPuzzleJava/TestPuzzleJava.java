import java.util.ArrayList;
import java.util.Random;

class PuzzleJava {
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            rolls.add(rand.nextInt(6) + 1); // Rolling a six-sided die
        }
        return rolls;
    }

    // You can add more methods here if needed for other test cases.
}

public class TestPuzzleJava {
    
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);
        
        //..
        // Write your other test cases here.
        //..
    }
}
