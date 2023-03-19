package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class boj_17298 {

    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] num = new int[n];
        int[] ans = new int[n];

        StringTokenizer tk = new StringTokenizer(bf.readLine());
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(tk.nextToken());
        }

        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < n; i++) {       // n 번 반복하면서
            while (!stk.isEmpty() && num[stk.peek()] < num[i]) {      //비어있지 않고, 해당 인덱스의 숫자가 현재숫자보다 작을동안 반복
                ans[stk.pop()] = num[i];                            //ans의 해당 인덱스에 현재값을 넣는다.
            }
            stk.push(i);                                            //값이 아닌 인덱스를 넣음(ans에 맞는 값을 넣어주기 위해)
        }

        while (!stk.isEmpty()) {
            ans[stk.pop()] = -1;                                    //스택에 남아있는 인덱스들은 값이 -1이 들어가야함
        }

        StringBuilder sb = new StringBuilder();
        for (int x : ans) {
            sb.append(x).append(" ");
        }
        System.out.println(sb);
    }
}
