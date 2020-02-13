import java.util.Random;
/**
 * ComputerPlayer class extends Player
 * @author Johnathan Poeschel
 * @version 1.0, 25 Nov 2019
 */
public class ComputerPlayer extends Player {
    /**
     * makeMove function generates move for computer player
     * @param board the game board to validate move
     * @return a valid spot to place a char in game board
     */
    public int makeMove(Board board){
        boolean temp = true;
        int num =-1;
        while(temp){
            try {
                Random rand = new Random(System.nanoTime());
                num = rand.nextInt(9);
                String help = Integer.toString(num);
                if (!help.matches("[0-8]")|| board.get(num)!=' ') {
                    throw new IllegalArgumentException("");
                }
                temp = false;
            }catch (Exception a){}
        }
        return num;
    }
}
