package org.example.piece;

import org.example.Color;

public class RookPiece extends Piece {

    public RookPiece(Color color) {
        this.name = "Rook";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty) {
        return MoveUtil.isStraightMove(i, j, x, y);
    }
}
