package org.example.piece;

public class MoveUtil {

    public static boolean isStraightMove(int i, int j, int x, int y) {
        if (i == x || j == y)
            return true;
        return false;
    }

    public static boolean isDiagonalMove(int i, int j, int x, int y) {
        int vertical = Math.abs(i-x);
        int horizontal = Math.abs(j-y);
        if (vertical == horizontal)
            return true;
        return false;
    }

    public static boolean isKnightMove(int i, int j, int x, int y) {
        if (x > i+2 || y > j+2 || x < i-2 || y < j-2 || x == i || j == y) return false;
        if ((x == i-1 || x == i+1) && (y == j+2 || y == j-2)) return true;
        else if ((y == j-1 || y == j+1) && (x == i+2 || x == i-2)) return true;
        return false;
    }
}
