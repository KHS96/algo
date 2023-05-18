package d3;

import java.io.*;
import java.util.*;

class swea_11315 {
    static int[] dx = {0, 1, 1, -1};
    static int[] dy = {1, 0, 1, 1};
    static char[][] map;
    static int n;

    public static void main(String args[]) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(bf.readLine());
            map = new char[n][n];
            String ans = "NO";
            for (int i = 0; i < n; i++) {
                String temp = bf.readLine();
                for (int j = 0; j < n; j++) {
                    map[i][j] = temp.charAt(j);
                }
            }

            ans = solve();

            System.out.println("#" + test_case + " " + ans);
        }
    }

    static String solve() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'o') {
                    for (int d = 0; d < 4; d++) {
                        boolean rs = check(i, j, d);
                        if (rs) {
                            return "YES";
                        }
                    }
                }
            }
        }
        return "NO";
    }

    static boolean check(int x, int y, int dir) {
        for (int i = 0; i < 4; i++) {
            x = x + dx[dir];
            y = y + dy[dir];

            if (x < 0 || y < 0 || x >= n || y >= n)
                return false;
            if (map[x][y] != 'o')
                return false;
        }

        return true;
    }

}