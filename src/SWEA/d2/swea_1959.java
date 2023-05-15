package SWEA.d2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_1959 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int tc = 1; tc <= t; tc++) {
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int []arr1 = new int[n];
            int []arr2 = new int[m];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr1[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++){
                arr2[i] = Integer.parseInt(st.nextToken());
            }

            int lt = 0;
            int rt;
            int end;
            int []arr3;
            int []arr4;
            if(n>m){
                rt = m-1;
                end=n;
                arr3 = arr2;
                arr4 = arr1;
            }else{
                rt = n-1;
                end=m;
                arr3 = arr1;
                arr4 = arr2;
            }
            int max = Integer.MIN_VALUE ;
            while(rt<end){
                int sum=0;
                for(int i=0;i<arr3.length;i++){
                    sum += arr3[i] * arr4[i+lt];
                }
                max = Math.max(max,sum);
                lt++;rt++;
            }
            System.out.println("#" + tc + " " +max);





        }
    }
}
