/**
 * Player class
 * @author Johnathan Poeschel
 * @version 1.0, 25 Nov 2019
 */
public abstract class Player {
    /**
     * makeMove method, must be defined for each player
     * @param board game board to vaildate move
     * @return int for spot to move in
     */
    public int makeMove(Board board){return 0;}
}
