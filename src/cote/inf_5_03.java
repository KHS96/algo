package cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class inf_5_03 {
    static int solution(int[][] board, int[] moves) {
        int ans = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int temp = board[j][moves[i] - 1];
                if (temp != 0) {
                    if (!stk.isEmpty() && stk.peek() == temp) {
                        stk.pop();
                        ans += 2;
                    }else{
                        stk.push(temp);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int board[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int m = Integer.parseInt(br.readLine());
        int moves[] = new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(board, moves));


    }
}
