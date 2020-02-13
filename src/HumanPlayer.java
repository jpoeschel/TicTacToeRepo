import java.util.Scanner;
/**
 * HumanPlayer class extends Player
 * @author Johnathan Poeschel
 * @version 1.0, 25 Nov 2019
 */
public class HumanPlayer extends Player {
    /**
     * makeMove function asks user which spot they want to draw
     * @param board the game board to validate move
     * @return a valid spot to place a char in game board
     */
    public int makeMove(Board board){
        boolean temp = true;
        String in ="";
        while(temp){
            try {
                System.out.println("Which space would you like to draw in? (1-9)");
                Scanner input = new Scanner(System.in);
                in = input.nextLine();
                if (!in.matches("[1-9]")|| board.get(Integer.parseInt(in)-1)!=' ') {
                    throw new IllegalArgumentException("Please enter 1-9");
                }
                temp = false;
            }catch (Exception a){}
        }
        return Integer.parseInt(in)-1;
    }
}
