package org.example;

import org.example.piece.*;

public class ChessBoard {
    Cell[][] board;

    ChessBoard() {
        board = new Cell[8][8];
        initializeBoard();
    }

    public boolean playMove(int i, int j, int x, int y, Color color) {
        if (board[i][j].piece == null || board[i][j].piece.color != color)
            return false;
       if(board[x][y].moveCell(board[i][j])) {
           board[i][j].piece = null;
           return  true;
       }
       return false;
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(board[i][j].piece != null)
                    System.out.print(" |(" +board[i][j].color+ ") "+board[i][j].piece.name+ "["+ board[i][j].piece.color+"]|");
                else
                    System.out.print(" |(" +board[i][j].color+ ")\t   \t|");
            }
            System.out.println("");
        }
    }

    private void initializeBoard() {
        boolean isWhite = true;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Color color = isWhite ? Color.W : Color.B;
                Piece piece = initializePiece(i, j);
                board[i][j] =  new Cell(i, j, color, piece);
                isWhite = !isWhite;
            }
            isWhite = !isWhite;
        }
    }

    public Piece initializePiece(int i, int j) {
        Piece piece = null;
        Color color = Color.B;
        switch (i) {
            case 0 :
                color = Color.W;
            case 7 :
                switch (j) {
                    case 0:
                    case 7:
                        piece = new RookPiece(color);
                        break;
                    case 1:
                    case 6:
                        piece = new KnightPiece(color);
                        break;
                    case 2:
                    case 5:
                        piece = new BishopPiece(color);
                        break;
                    case 3:
                        piece = new QueenPiece(color);
                        break;
                    case 4:
                        piece = new KingPiece(color);
                        break;
                }
                break;
            case 1 :
                color = Color.W;
            case 6 :
                piece = new PawnPiece(color);
                break;

        }
        return piece;
    }
}
