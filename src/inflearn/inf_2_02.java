package inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_02 {
    static int solution(int[] n) {
        int ans = 1;
        int front = n[0];
        for(int i=1; i<n.length; i++){
            if(n[i] > front){
                ans++;
                front=n[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];
        StringTokenizer tk = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            num[i] = Integer.parseInt(tk.nextToken());
        }
        System.out.println(solution(num));

    }
}
