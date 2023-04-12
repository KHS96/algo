package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_08 {

    static int[] solution(int n, int[] num) {
        int []rank = new int[n];
        for(int i=0;i<n;i++){
            int t = 1;
            for(int j=0;j<n;j++){
                if(num[i] < num[j])
                    t++;
            }
            rank[i] = t;
        }


        return rank;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        for(int x : solution(n,num))
            System.out.print(x+" ");


    }
}
