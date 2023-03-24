package boj;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_1697 {
    static Queue<Integer> q = new LinkedList<>();
    static int[] map = new int[100001];
    static int n,m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());

        map[n] = 1;
        q.offer(n);
        while (!q.isEmpty()) {
            int nx;
            int t = q.poll();

            if(t == m){
                System.out.println(map[t]-1);
            }

            for(int i=0;i<3;i++){
                if(i==0){
                   nx = t+1;
                }else if(i==1){
                    nx = t-1;
                }else{
                    nx = t*2;
                }

                if(nx<0 || nx > 100000 || map[nx]!=0) continue;
                q.offer(nx);
                map[nx] = map[t]+1;
            }
        }
    }

}
