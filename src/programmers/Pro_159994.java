package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class Pro_159994 {

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> q1 = new LinkedList<>();  //cards1을 담을 큐 선언
        Queue<String> q2 = new LinkedList<>();  //cards2을 담을 큐 선언

        for (int i = 0; i < cards1.length; i++) {       //q큐에 값들을 넣어줌
            q1.offer(cards1[i]);
        }
        for (int i = 0; i < cards2.length; i++) {
            q2.offer(cards2[i]);
        }

        for (int i = 0; i < goal.length; i++) {         //goal의 길이만큼 반복하며 큐들의 맨 앞 값들중 하나라도 goal이랑 같은게 있다면 제거 그렇지 않다면 No 리턴
            if (goal[i].equals(q1.peek())) {
                q1.poll();
                continue;
            } else if (goal[i].equals(q2.peek())) {
                q2.poll();
                continue;
            } else {
                return "No";
            }
        }

        return "Yes";                                  // No가 반환되지 않았다면 문장이 완성되었으므로 Yes 리턴
    }

    public static void main(String[] args) {
        String[] c1 = {"i","drink","water"};
        String[] c2 = {"want", "to"};
        String[] goal = {"i","want","to","drink","water"};
        System.out.println(solution(c1,c2,goal));
    }
}
