package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class inf_2_03 {
    static String solution(int[] a, int[] b, int n) {
        /*
        * 1 : 가위
        * 2 : 바위
        * 3 : 보
        * A가 이기면 A, B가 이기면 B, 비기면 D 출력
        * */
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(a[i] == b[i])
                sb.append("D").append("\n");
            else if( (a[i] == 1 && b[i] == 3) || (a[i] == 2 && b[i] == 1) || (a[i] == 3 && b[i] == 2))
                sb.append("A").append("\n");
            else
                sb.append("B").append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int []A = new int[n];
        int []B = new int[n];
        StringTokenizer tk = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            A[i] = Integer.parseInt(tk.nextToken());
        }
        tk = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            B[i] = Integer.parseInt(tk.nextToken());
        }
        System.out.println(solution(A,B,n));

    }
}
