package programmers;

import java.util.*;

public class Pro_12980 {
    public static int solution(int n) {
        int ans = 0;

        while (n != 0) {    //0이 될 때 까지 반복
            if (n % 2 == 0) //짝수이면 나누기 2 -> 순간이동
                n /= 2;
            else {          //홀수이면 -1 -> 점프
                n -= 1;
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
