package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class swea_10570 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        boolean[] isPalindrome = new boolean[32];
        for (int i = 1; i < 32; i++) {
            if (chk(i) && chk((int) Math.pow(i, 2))) {
                isPalindrome[i] = true;
            }
        }

        for (int tc = 1; tc <= t; tc++) {
            int ans = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = (int) Math.ceil(Math.sqrt(Integer.parseInt(st.nextToken())));
            int m = (int) Math.floor(Math.sqrt(Integer.parseInt(st.nextToken())));

            for (int i = n; i <= m; i++) {
                if (isPalindrome[i])
                    ans++;
            }
            System.out.println("#" + tc + " " + ans);
        }

    }

    static boolean chk(int n) {
        String tmp = Integer.toString(n);
        for (int i = 0; i < tmp.length()/2; i++) {
            if (tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i))
                return false;
        }
        return true;

    }

}
