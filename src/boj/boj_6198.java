package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj_6198 {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stk = new Stack<>();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = Integer.parseInt(bf.readLine());
        }
        long result = 0;
        //풀이법
        /* ex) 10 3 7 4 12 2순으로 입력이 들어왔을때
        * 10이 들어갈땐 관측가능한 빌딩이 없다, stk의 size인 0을 더하고 10을 push
        * 새로운 3이 들어왔을때 현재 stk에 쌓여져있는 10높이의 빌딩 1개 에서는 새로 들어온 빌딩이 관측이 가능하므로 +1(stk.size) 해주고 stk에 push    현재  ans = 1
        * 7이 들어왔을땐 3은 관측이 불가능하므로 pop 해주고 현재stk에는 10빌딩이 있다. 높이 10의 빌딩 하나만이 높이 7의 빌딩을 관측가능하므로 +1  하고 7을 push    현재 ans = 2
        * 그다음 값으로 4가 들어왔을땐 10, 7 두개의 빌딩이 관측가능하므로 해당 스택의 size(관측가능한 빌딩들의 개수)인 +2 를 해주고 4를 push   현재 ans = 4;
        * 다음으로 12가 들어왔을땐 관측가능한 빌딩들이 없으므로 모두 pop 후에 size만큼 0을 더해주고 12를 push
        * 마지막 반복문을 돌며 2가 들어왔을때 12높이의 빌딩이 2가 관측가능하므로 size를 더해주고 push 12 2
        *
        *
        * */
        for (int i = 0; i < n; i++) {
            while(!stk.isEmpty() && stk.peek() <= heights[i]){  //비어있지않고, 제일 위의값이 heights[i]값보다 작을때만 pop    //높이가 같아도 못본다
                stk.pop();
            }
            result += stk.size();
            stk.push(heights[i]);
        }
        System.out.println(result);

    }
}
