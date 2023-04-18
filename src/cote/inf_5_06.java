package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class inf_5_06 {
    static int solution(int n, int k, int[]arr) {
        int ans = 1;
        Queue<Order> q = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            q.offer(new Order(i,arr[i]));
        }

        while(!q.isEmpty()){
            Order tmp = q.poll();
            for(Order x : q){
                if(x.pr > tmp.pr){
                    q.add(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                if(tmp.idx==k)
                    return ans;
                else
                    ans++;
            }
        }


        return ans;

    }
    public static class Order{
        int idx;
        int pr;

        public Order(int idx, int pr) {
            this.idx = idx;
            this.pr = pr;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n,k,arr));


    }
}
