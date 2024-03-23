package org.example.piece;

import org.example.Color;

public class PawnPiece extends Piece {

    public PawnPiece(Color color) {
        this.name = "Pawn";
        this.color = color;
    }

    @Override
    public boolean isValidMove(int i, int j, int x, int y, boolean isAttack) {
        if (this.color == Color.B){
            if (x >= i) return false;
            if (i == 6) {
                final boolean attack = isAttack && x == i - 1 && (y == j + 1 || y == j - 1);
                if (!isAttack && x <= i-2 && j == y || attack) {
                    return true;
                } else {
                    if (!isAttack && x <= i - 1 && j == y || attack) {
                        return true;
                    }
                }
            }
        } else {
            if (x <= i) return false;
            final boolean attack = isAttack && x == i + 1 && (y == j + 1 || y == j - 1);
            if (i == 1) {
                if (!isAttack && x <= i+2 && j == y || attack) {
                    return true;
                }
            } else {
                if (!isAttack && x <= i+1 && j == y || attack) {
                    return true;
                }
            }
        }
        return false;
    }
}
