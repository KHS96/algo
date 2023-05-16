package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_15612 {
    static char[][] board;
    static int[] row;
    static int[] col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            board = new char[8][8];
            row = new int[8];
            col = new int[8];
            String ans = "yes";
            int cnt = 0;
            for (int i = 0; i < 8; i++) {
                String temp = br.readLine();
                for (int j = 0; j < 8; j++) {
                    char ch = temp.charAt(j);
                    board[i][j] = ch;
                    if (ch == 'O') {
                        cnt++;
                        if (row[j] != 0 || col[i] != 0) {
                            ans = "no";
                            break;
                        } else {
                            col[i]++;
                            row[j]++;
                        }
                    }
                }
            }
            if(cnt!=8)
                ans="no";

            System.out.println("#" + tc + " " + ans);
        }
    }

}
