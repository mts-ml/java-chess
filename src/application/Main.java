package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Main {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());

        Board board = new Board(8, 8);

        System.out.println(board.positionExists(new Position(0, 0))); // true
        System.out.println(board.positionExists(new Position(-1, 3))); // false

    }
}
