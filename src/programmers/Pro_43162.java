package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_43162 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[] visit;
    static int answer = 0;
    public static int solution(int n, int[][] computers) {

        visit = new int[n+1];
        dfs(0,n,computers);


        return answer;
    }
    public static void dfs(int num,int n,int[][]computers){
        visit[num]=1;
        for(int i=0;i<n;i++){
            if(computers[num][i] == 1 && visit[i]==0)
                dfs(i,n,computers);
        }
        answer++;
    }


    public static void main(String[] args) {
        int[][] com = {{1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}};
        System.out.println(solution(4, com));
    }
}
