package org.example.piece;

import org.example.Color;

public class KingPiece extends Piece {

    public KingPiece(Color color) {
        this.name = "King";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty) {
        int vertical = Math.abs(i-x);
        int horizontal = Math.abs(j-y);
        if (vertical <= 1 && horizontal <= 1)
            return true;
        return false;
    }
}
