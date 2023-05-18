package note;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class note2 {
    public static void main(String[] args) {

        String n = "321";
        System.out.println(solution(n));

    }

    public static int solution(String number) {
        int answer = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(number.charAt(0));
        sb.append(number.charAt(0) + 1 - '0');
        System.out.println(sb);
        for (int i = 1; i < number.length(); i++) {
            char c = number.charAt(i);
            if (sb.charAt(sb.length() - 1) == c) {
                continue;
            } else if (i == sb.length() - 1 && !(sb.charAt(sb.length() - 1) == c)) {
                sb = new StringBuilder(sb.substring(0, sb.length() - 1));
                answer++;
            }
            sb.append(c);
            answer++;
            if (c != '0') {
                sb.append(c + 1 - '0');
            }
//            while (!sb.equals(number.substring(0, sb.length()))) {
//                sb = new StringBuilder(sb.substring(0, sb.length() - 1));
//                answer++;
//            }


            System.out.println(sb);
        }
        if (sb.length() != number.length())
            answer++;

        return answer;
    }

}
