package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class inf_2_07 {

    static int solution(int[] num) {
        int ans = 0;
        int idx = 1;
        for(int i=0;i<num.length;i++){
            if(num[i]==1){
                ans+=idx;
                idx++;
            }else{
                idx = 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(num));

    }
}
