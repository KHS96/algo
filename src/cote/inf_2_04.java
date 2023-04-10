package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_04 {
    static String solution(int n) {
        int [] arr = new int[n];
        StringBuilder sb = new StringBuilder();
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<n;i++){
            arr[i] = arr[i-2] + arr[i-1];
        }

        for(int i = 0;i<n;i++){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));

    }
}
