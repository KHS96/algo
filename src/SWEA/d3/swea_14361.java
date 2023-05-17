package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class swea_14361 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String n = br.readLine();
            String ans = "impossible";
            char ch[] = n.toCharArray();
            Arrays.sort(ch);

            int idx = 2;
            while (true) {
                int nn = Integer.parseInt(n) * idx;
                char[] nch = Integer.toString(nn).toCharArray();
                Arrays.sort(nch);
                if (ch.length != nch.length)
                    break;


                if (Arrays.equals(ch, nch)) {
                    ans = "possible";
                    break;
                }
                idx++;
            }


            System.out.println("#" + tc + " " + ans);
        }
    }

}
