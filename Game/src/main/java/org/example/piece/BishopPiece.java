package org.example.piece;


import org.example.Color;

public class BishopPiece extends Piece {

    public BishopPiece(Color color) {
        this.name = "Bishop";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty) {
        return MoveUtil.isDiagonalMove(i, j, x, y);
    }
}
