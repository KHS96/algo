package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_6_05 {
    static String solution(int n, int[] arr) {
        String ans="U";
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1])
                ans="D";
        }


        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n,arr));


    }
}
