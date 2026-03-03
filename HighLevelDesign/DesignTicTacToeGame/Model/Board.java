package LLD_HLD.HighLevelDesign.DesignTicTacToeGame.Model;

import java.util.ArrayList;
import java.util.List;



public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece)
    {
        if(board[row][column]!=null) {
            return false;
        }
        board[row][column] = playingPiece;
        return true;
    }//8:34


    public void printBoard() {

    }

    public List<Pair<Integer,Integer>> getFreeCells() {
        List<Pair<Integer,Integer>> freeCells = new ArrayList<>();
        for(int i = 0 ; i < size ; i++){
            for(int  j = 0 ; j < size; j++){
                if(board[i][j] == null){
                    Pair<Integer,Integer> rowColumn = new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }
}


