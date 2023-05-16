package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swea_2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){

            int n = Integer.parseInt(br.readLine());
            int [][]arr = new int[n][n];
            int ans =0;
            int mid = n/2;
            for(int i=0;i<n;i++){
                String temp = br.readLine();

                if(i<=mid){
                    for(int j = mid-i;j<mid+i+1;j++){
                        ans+=temp.charAt(j)-'0';
                    }
                }else{
                    for(int j = i-mid;j<n+mid-i;j++){
                        ans+=temp.charAt(j)-'0';
                    }
                }
            }

            System.out.println("#" + tc + " " + ans);
        }
    }

}
