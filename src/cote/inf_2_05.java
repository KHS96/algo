package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inf_2_05 {

    static int solution(int n) {
        int ans = 0;
        int [] ch = new int[n+1];
        for(int i=2; i<=n; i++){
            if(ch[i]==0){
                ans++;
                for(int j=i*i;j<=n;j+=i){
                    ch[j]=1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());



        System.out.println(solution(n));

    }
}
