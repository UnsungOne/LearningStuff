
package pl.sda.helloworld.Stuff;

import java.util.Arrays;

public class Checkboard {

    public static void main(String[] args) {

        int N = 8;
        int[][] board;

        board = new int[N][N];
        for (int i = 1; i < board.length; i++) {
            for (int j = 2; j < board[i].length; j++) {
                board[j][i] = (int) Math.pow(i, j);
            }
        }
        print(board);
        System.out.println();
        //System.out.println(Arrays.deepToString(board));
    }

    static void print(int [][] board) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            sb.append("|");
            for (int j = 0; j < board[i].length; j++) {
                sb.append(board[j][i]).append("|");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}