package org.example.piece;

import org.example.Color;

public abstract class Piece {
    public Color color;
    public String name;
    public abstract boolean isValidMove(int i, int j, int x, int y, boolean isTargetEmpty);
}
