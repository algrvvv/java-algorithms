package com.algrvvv.strings;

/**
 * @see <a href="https://leetcode.com/problems/determine-color-of-a-chessboard-square/">1812. Determine Color of a Chessboard Square</a>
 */
public class DetermineColorOfChessboardSquare {
    public static boolean squareIsWhite(String coordinates) {
        // буква четная и число нечетное -> тру
        char symbol = coordinates.charAt(0);
        int num = coordinates.charAt(1) - '0';
        if (num == 1) return Character.hashCode(symbol) % 2 == 0;
        else if (Character.hashCode(symbol) % 2 == 0 && num % 2 != 0) return true;
        else if (Character.hashCode(symbol) % 2 != 0) return num % 2 == 0;
        return false;
    }
}
