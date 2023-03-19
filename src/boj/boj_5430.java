package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class boj_5430 {
    static Deque<Integer> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String cmd = "";    //커맨드 RDD

        for (int i = 0; i < n; i++) {
            cmd = br.readLine();


            //[1,2,3,4]의 형식으로 문자열이 입력되기 때문에 숫자만 입력받게 해준다.
            int num = Integer.parseInt(br.readLine());
            String nums = br.readLine().replace("[", "").replace("]", "");
            String[] s = nums.split(",");


            //deque에 삽입
            for (String x : s) {
                if (!x.equals("")) {
                    q.offer(Integer.parseInt(x));
                }
            }

            //error 체크할 변수와 뒤집어졌는지 체크할 변수 선언
            boolean error = false;
            boolean reverse = false;

            for (int j = 0; j < cmd.length(); j++) {
                if (cmd.charAt(j) == 'R') {     //R이 들어오면 deque을 뒤집었다고 처리 해준다.
                    reverse = !reverse;
                }
                if (cmd.charAt(j) == 'D') {     //D가 들어오면 만약 비어있으면 error처리
                    if (q.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reverse) {              //R이 입력되서 뒤집어 졌다면 뒤에서부터 삭제하면 된다. pollLast , 이후 답 출력할때도 반대로 해주면 된다.
                        q.pollLast();
                    } else {                    //그렇지 않다면 앞에서부터 Poll First
                        q.pollFirst();
                    }
                }
            }

            if (error) {
                System.out.println("error");
            } else {
                StringBuilder sb = new StringBuilder("[");
                while (!q.isEmpty()) {
                    if (reverse) {
                        sb.append(q.pollLast()).append(",");
                    } else {
                        sb.append(q.pollFirst()).append(",");
                    }
                }
                if (sb.length() > 1) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("]");

                System.out.println(sb);

            }
        }
    }
}
