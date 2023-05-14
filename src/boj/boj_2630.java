package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2630 {
    static int[][] board;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        part(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }

    public static void part(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        part(row, col, newSize);
        part(row, col + newSize, newSize);
        part(row + newSize, col, newSize);
        part(row + newSize, col + newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {

        int color = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color)
                    return false;
            }
        }

        return true;
    }
}
