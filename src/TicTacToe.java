import java.util.Scanner;
/**
 * TicTacToe class
 * @author Johnathan Poeschel
 * @version 1.0, 25 Nov 2019
 */
public class TicTacToe {
    /**
     * private Player object for player1
     */
    private Player player1;
    /**
     * private Player object for player2
     */
    private Player player2;
    /**
     * Private board object to hold board information and methods
     */
    private Board board = new Board();

    /**
     * TicTacToe constructor displays board and runs game
     */
    public  TicTacToe(){
        chosePlayers();
        board.display();

        boolean temp = true;
        while(!board.checkFull() && !board.checkWin()){
            char xOro;
            if(temp){
                System.out.println("Player 1's Turn");
                xOro = 'x';
                board.set(player1.makeMove(board),xOro);
                board.display();
                if(board.checkWin()){
                    System.out.println("Player 1 Wins");
                }
                else if(board.checkFull()){
                    System.out.println("Tie Game");
                }
            }
            else{
                System.out.println("Player 2's Turn");
                xOro = 'o';
                board.set(player2.makeMove(board),xOro);
                board.display();
                if(board.checkWin()){
                    System.out.println("Player 2 Wins");
                }
                else if(board.checkFull()){
                    System.out.println("Tie Game");
                }
            }
            temp = !temp;
        }
    }

    /**
     * private helper function chosePlayers, gives user choice between computer and human players
     */
    private void chosePlayers(){
        boolean temp = true;
        String playerChoice = "";
        while(temp){
            System.out.println("Enter Number For Type of Players");
            System.out.println("1 = Player vs Player");
            System.out.println("2 = Player vs Computer");
            System.out.println("3 = Computer vs Computer");
            try {
                Scanner input = new Scanner(System.in);
                playerChoice = input.nextLine();
                if (!playerChoice.matches("[123]")) {
                    throw new IllegalArgumentException("");
                }
                temp = false;
            } catch (Exception a) {}
        }
        if(playerChoice.matches("[1]")){
            System.out.println("Player vs Player");
            player1 = new HumanPlayer();
            player2 = new HumanPlayer();
        }
        else if(playerChoice.matches("[2]")){
            System.out.println("Player vs Computer");
            player1 = new HumanPlayer();
            player2 = new ComputerPlayer();
        }
        else if(playerChoice.matches("[3]")){
            System.out.println("Computer vs Computer");
            player1 = new ComputerPlayer();
            player2 = new ComputerPlayer();
        }
        System.out.println("Player 1 = x");
        System.out.println("Player 2 = o");

    }
}
