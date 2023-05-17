package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_13428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            String s = br.readLine();
            int max = Integer.parseInt(s);
            int min = max;
            char[] ch = s.toCharArray();

            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    char tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;

                    if (ch[0] != '0' && Integer.parseInt(String.valueOf(ch)) < min) {
                        min = Integer.parseInt(String.valueOf(ch));
                    }
                    if (ch[0] != '0' && Integer.parseInt(String.valueOf(ch)) > max) {
                        max = Integer.parseInt(String.valueOf(ch));
                    }
                    tmp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = tmp;

                }
            }

            System.out.println("#" + tc + " " + min + " " + max);
        }

    }

}
