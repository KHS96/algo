package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class swea_2806 {
    static int []map;
    static int ans;
    static int n;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc=1;tc<=t;tc++){
            ans = 0;
            n = Integer.parseInt(br.readLine());
            map = new int[n];


            dfs(0);
            System.out.println("#" + tc + " " + ans);
        }
    }
    static void dfs(int depth){

        if(depth == n){
            ans++;
            return;
        }


        for(int i=0;i<n;i++){
            map[depth] = i;

            if(Possibility(depth)){
                dfs(depth+1);
            }
        }
    }

    static boolean Possibility(int depth) {

        for(int i=0;i<depth;i++){
            if(map[i] == map[depth]){
                return false;
            }else if(Math.abs(depth-i) == Math.abs(map[depth]-map[i])){
                return false;
            }
        }
        return true;
    }

}
