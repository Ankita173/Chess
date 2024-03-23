package org.example.piece;

import org.example.Color;

public class QueenPiece extends Piece {

    public QueenPiece(Color color) {
        this.name = "Queen";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty) {
        if (MoveUtil.isStraightMove(i, j, x, y) || MoveUtil.isDiagonalMove(i, j, x, y))
            return true;
        return false;
    }
}
