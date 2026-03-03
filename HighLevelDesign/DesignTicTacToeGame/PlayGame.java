package LLD_HLD.HighLevelDesign.DesignTicTacToeGame;

import LLD_HLD.HighLevelDesign.DesignTicTacToeGame.Model.Board;
import LLD_HLD.HighLevelDesign.DesignTicTacToeGame.Model.Player;
import LLD_HLD.HighLevelDesign.DesignTicTacToeGame.Model.PlayingPiece;
import LLD_HLD.HighLevelDesign.DesignTicTacToeGame.Model.PlayingPieceX;

import java.util.Deque;
import java.util.LinkedList;

public class PlayGame {
    public static void main(String[] args){
        System.out.println("\n=====>>> TicTacToe Game\n");

        TicTacToeGame game = new TicTacToeGame();

        game.initializeGame();

        System.out.println("game winner is: " + game.startGame());
    }
}
