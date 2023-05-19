package SWEA.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class swea_8931 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= t; tc++) {
            int n = Integer.parseInt(br.readLine());
            Stack<Integer> recipe = new Stack<>();

            int ans = 0;
            for (int i = 0; i < n; i++) {
                int temp = Integer.parseInt(br.readLine());
                if (temp != 0) {
                    recipe.push(temp);
                } else {
                    recipe.pop();
                }
            }
            while(!recipe.empty()){
                ans+=recipe.pop();
            }


            System.out.println("#" + tc + " " + ans);
        }
    }

}
