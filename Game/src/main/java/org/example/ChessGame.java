package org.example;

public class ChessGame {
    public static void main(String[] args) {
        Game chess = new Game("Ankita", "Saransh");
        chess.gameStatus();
        System.out.println(chess.platTurn(0, 1, 2, 2));
        System.out.println(chess.platTurn(7, 6, 5, 7));
        System.out.println(chess.platTurn(1, 4, 3, 4));
        System.out.println(chess.platTurn(6, 4, 4, 4));
        System.out.println(chess.platTurn(7, 4, 4, 4));
    }
}
