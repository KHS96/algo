package programmers;

public class Pro_12909 {
    static boolean solution(String s) {
        boolean answer = true;

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                sum += 1;
            else
                sum -= 1;

            if (sum < 0)
                return false;
        }
        if (sum != 0)
            return false;

        return answer;
    }

    public static void main(String[] args) {
        String s = "()()";
        System.out.println(solution(s));
    }
}
