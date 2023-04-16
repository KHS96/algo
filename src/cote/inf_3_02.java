package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class inf_3_02 {
    static ArrayList<Integer> solution(int n, int m, int[] a, int []b) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1=0, p2=0;
        while(p1<n && p2<m){
            if(a[p1] == b[p2]){
                ans.add(a[p1++]);
                p2++;
            }else if(a[p1]<b[p2]){
                p1++;
            }else{
                p2++;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n,m,arr1,arr2)){
            System.out.print(x+" ");
        }


    }
}
