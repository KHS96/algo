package programmers;

public class Pro_43165 {
    static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);    //숫자배열, 목표 값, 인덱스, 합
        return answer;
    }

    public static void dfs(int[] numbers, int target, int i, int sum) {
        if (i == numbers.length) {
            if (sum == target)
                answer++;
        } else {
            dfs(numbers, target, i + 1, sum + numbers[i]);      //누적된 값에서 플러스를 진행
            dfs(numbers, target, i + 1, sum - numbers[i]);      //누적된 값에서 마이너스를 진행
        }
    }

    public static void main(String[] args) {
        int [] num  = {1,1,1,1,1};
        int target = 3;
        System.out.println(solution(num,target));
    }
}
