package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_13732 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            char[][] map = new char[n][n];
            int mini = n+1;
            int minj = n;
            int maxi = -1;
            int maxj = -1;
            String ans = "yes";
            for (int i = 0; i < n; i++) {
                String temp = br.readLine();
                for (int j = 0; j < n; j++) {
                    char ch = temp.charAt(j);
                    map[i][j] = ch;
                    if (ch == '#') {
                        mini = Math.min(mini,i);
                        maxi = Math.max(maxi,i);
                        minj = Math.min(minj,j);
                        maxj = Math.max(maxj,j);
                    }
                }
            }
            System.out.println(mini + " " + maxi);
            System.out.println(minj + " " + maxj);
            if (maxi - mini != maxj - minj) {
                ans = "no";
            }

            for (int i = mini; i <= maxi; i++) {
                for (int j = minj; j <= maxj; j++) {
                    if (map[i][j] != '#') {
                        ans = "no";
                        break;
                    }
                }
            }

            System.out.println("#" + tc + " " + ans);
        }

    }

}
