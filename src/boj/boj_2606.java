package boj;

import java.util.*;
import java.io.*;


public class boj_2606 {
    static int [] visit;
    static int [][] board;
    static int answer;
    static int V;
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(bf.readLine()); // 점 개수
        int E = Integer.parseInt(bf.readLine()); // 간선 개수
        visit = new int[V+1];
        board = new int[V+1][V+1];
        for(int i=0; i<E ;i++){
            StringTokenizer tk = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(tk.nextToken());
            int y = Integer.parseInt(tk.nextToken());
            board[x][y] = 1;
            board[y][x] = 1;
        }
        dfs(1);

        System.out.println("answer = " + (answer-1));
    }
    public static void dfs(int n){
        visit[n] = 1;
        for(int i=1;i<=V;i++){
            if(board[n][i] == 1 && visit[i] == 0)
                dfs(i);
        }
        answer++;
    }

}
