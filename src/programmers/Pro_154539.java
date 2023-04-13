package programmers;

import java.util.ArrayList;
import java.util.Stack;

public class Pro_154539 {
    public static int[] solution(int[] numbers) {
        Stack<Integer> stk = new Stack<>();
        int[] answer = new int[numbers.length];
        //answer은 해당 숫자의 index를 저장

        for (int i = 0; i < numbers.length; i++) {
            if(stk.isEmpty() || numbers[i]<numbers[i-1]){ //비어있거나, 현재값이 전값보다 작으면 푸쉬 ex) 3 2
                stk.push(i);
            }else{
                while(!stk.isEmpty() && numbers[stk.peek()]<numbers[i]){ //비어있지않고, 현재값 보다 작은 인덱스
                    answer[stk.pop()] = numbers[i];
                }
                stk.push(i);
            }
        }
        while(!stk.isEmpty()){
            answer[stk.pop()]=-1;
        }


        return answer;
    }

    public static void main(String[] args) {
        int []num = {9,1,5,3,6,2};
        for(int x : solution(num))
            System.out.println(x);
    }
}
