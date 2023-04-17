package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_4_01 {
    static char solution(int[] arr) {
        int max = -1;
        int idx = 0;
        for (int i = 0; i < 6; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }
        return (char)('A'+idx);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }
        System.out.println(solution(arr));

    }
}
