import java.util.ArrayList;
/**
 * Board class
 * @author Johnathan Poeschel
 * @version 1.0, 25 Nov 2019
 */
public class Board {
    /**
     * ArrayList of characters holds board contents
     */
    private ArrayList<Character> boardContents = new ArrayList<>(9);

    /**
     * constructor for Board instantiates boardContents to blank characters
     */
    public Board(){
        for(int i = 1; i<10; i++){ //create board with spaces in each index
            boardContents.add(' ');
        }
    }

    /**
     * display helper function prints boardContents neatly as a game board
     */
    public void display(){
        System.out.println(" "+boardContents.get(0)+" | "+boardContents.get(1)+" | "+boardContents.get(2));
        System.out.println("-----------");
        System.out.println(" "+boardContents.get(3)+" | "+boardContents.get(4)+" | "+boardContents.get(5));
        System.out.println("-----------");
        System.out.println(" "+ boardContents.get(6)+" | "+boardContents.get(7)+" | "+boardContents.get(8));
    }

    /**
     * set function sets board index to specefic character
     * @param index spot on board
     * @param c charater to be inserted
     */
    public void set(int index, char c){
        boardContents.set(index, c);
    }

    //function to check for any type of win

    /**
     * checkWin function checks if anybody has won the game
     * @return true if someone has won false else
     */
    public boolean checkWin(){
        return checkColumns() || checkRows() || checkDiagonals();
    }
    //function that checks each row for a win

    /**
     * private helper function checkRows checks each row for a win
     * @return true if win found false else
     */
    private boolean checkRows(){
        if((boardContents.get(0)==boardContents.get(1) && boardContents.get(1)==boardContents.get(2)) && !boardContents.get(0).equals(' ')){
            return true;
        }
        else if((boardContents.get(3)==boardContents.get(4) && boardContents.get(4)==boardContents.get(5)) && !boardContents.get(3).equals(' ')){
            return true;
        }
        else return (boardContents.get(6) == boardContents.get(7) && boardContents.get(7) == boardContents.get(8)) && !boardContents.get(6).equals(' ');
    }
    //function that checks each column for a win
    /**
     * private helper function checkColumns checks each column for a win
     * @return true if win found false else
     */
    private boolean checkColumns(){
        if((boardContents.get(0)==boardContents.get(3) && boardContents.get(3)==boardContents.get(6)) && !boardContents.get(0).equals(' ')){
            return true;
        }
        else if((boardContents.get(1)==boardContents.get(4) && boardContents.get(4)==boardContents.get(7)) && !boardContents.get(1).equals(' ')){
            return true;
        }
        else return (boardContents.get(2) == boardContents.get(5) && boardContents.get(5) == boardContents.get(8)) && !boardContents.get(2).equals(' ');
    }
    //function that checks each diagonal for a win
    /**
     * private helper function checkDiagonals checks each diagonal for a win
     * @return true if win found false else
     */
    private boolean checkDiagonals(){
        if((boardContents.get(0)==boardContents.get(4) && boardContents.get(4)==boardContents.get(8)) && !boardContents.get(0).equals(' ')){
            return true;
        }
        else return (boardContents.get(6) == boardContents.get(4) && boardContents.get(4) == boardContents.get(2)) && !boardContents.get(6).equals(' ');
    }
    //function to check if array is full of letters aka full. Used to stop game if there is no win, yet board is filled up.
    /**
     * checkFull helper function, checks if board is full of characters other than space
     * @return false if space is found true else
     */
    public boolean checkFull(){
        for(int i = 0; i<9; i++){
            if(boardContents.get(i).equals(' ')){
                return false;
            }
        }
        return true;
    }

    /**
     * get method get character at particular index
     * @param i index you want to see
     * @return char at index
     */
    public char get(int i){
        return boardContents.get(i);
    }

}
