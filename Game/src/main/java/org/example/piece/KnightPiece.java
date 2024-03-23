package org.example.piece;

import org.example.Color;

public class KnightPiece extends Piece {

    public KnightPiece(Color color) {
        this.name = "Knight";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty) {
        return MoveUtil.isKnightMove(i, j, x, y);
    }
}
