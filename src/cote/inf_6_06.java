package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_6_06 {
    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int []tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(tmp[i] != arr[i])
                ans.add(i+1);
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

        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }


    }
}
