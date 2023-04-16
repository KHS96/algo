package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_3_03 {
    static int solution(int n, int k, int[] a) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        int max = sum;
        for (int i = k; i < n; i++) {
            sum = sum + a[i] - a[i - k];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr1 = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, k, arr1));


    }
}
