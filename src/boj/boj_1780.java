package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1780 {
    static int[][] board;
    static int zero = 0;
    static int one = 0;
    static int mone = 0;

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

        System.out.println(mone);
        System.out.println(zero);
        System.out.println(one);

    }

    public static void part(int row, int col, int size) {

        if (colorCheck(row, col, size)) {
            if (board[row][col] == -1) {
                mone++;
            } else if (board[row][col] == 0) {
                zero++;
            } else {
                one++;
            }
            return;
        }

        int newSize = size / 3;

        part(row, col, newSize);
        part(row, col + newSize, newSize);
        part(row, col + 2 * newSize, newSize);

        part(row + newSize, col, newSize);
        part(row + newSize, col + newSize, newSize);
        part(row + newSize, col + 2 * newSize, newSize);

        part(row + 2 * newSize, col, newSize);
        part(row + 2 * newSize, col + newSize, newSize);
        part(row + 2 * newSize, col + 2 * newSize, newSize);
    }

    public static boolean colorCheck(int row, int col, int size) {

        int num = board[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != num)
                    return false;
            }
        }

        return true;
    }
}
