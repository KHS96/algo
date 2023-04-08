package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_1_11 {
    static int[] answer;

    static String solution(String s) {
        StringBuilder sb = new StringBuilder(s.charAt(0));

        int cnt = 0;
        char tmp = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == tmp) {
                cnt++;
            } else {
                sb.append(tmp);
                if (cnt > 1) {
                    sb.append(cnt);

                }
                tmp = s.charAt(i);
                cnt = 1;
            }
        }
        sb.append(tmp);
        if(cnt > 1)
            sb.append(cnt);
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
//        StringTokenizer tk = new StringTokenizer(br.readLine());
        System.out.println(solution(s));

    }
}
