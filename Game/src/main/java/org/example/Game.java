package org.example;

public class Game {
    ChessBoard board;
    ChessPlayer player1;
    ChessPlayer player2;
    ChessPlayer turn;

    public Game(String white, String black) {
        board = new ChessBoard();
        player1 = new ChessPlayer(white, Color.W);
        player2 = new ChessPlayer(black, Color.B);
        turn = player1;
    }

    public String platTurn(int i, int j, int x, int y) {
        if (i < 8 && i >= 0 &&
                j < 8 && j >= 0 &&
                i < 8 && i >= 0 &&
                j < 8 && j >= 0) {

            System.out.println("Playing turn: " + turn.name);
            if (board.playMove(i, j, x, y, turn.color)) {
                turn = turn == player1 ? player2 : player1;
                gameStatus();
                return String.format("Next turn: %s", turn.name);
            }
        }
        return "Invalid move!";
    }

    public void gameStatus() {
        board.printBoard();
    }
}
