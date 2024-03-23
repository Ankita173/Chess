package org.example;


import org.example.piece.Piece;

public class Cell {
    int i;
    int j;
    Color color;
    Piece piece;

    public Cell(int i, int j, Color color, Piece piece) {
        this.i = i;
        this.j = j;
        this.color = color;
        this.piece = piece;
    }

    public boolean moveCell(Cell source) {
        boolean isAttack = false;
        if(piece != null) isAttack = true;
        if (source.piece.isValidMove(source.i, source.j, i, j, isAttack)) {
            System.out.println("Piece died: "+ piece);
            piece = source.piece;
            return true;
        }
        return false;
    }
}
