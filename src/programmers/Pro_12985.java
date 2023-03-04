package programmers;

public class Pro_12985 {
    public static int solution(int n, int a, int b) {
        int answer = 0;
        while (true) {          //a,b가 만날 때 까지 반복
            a = (a + 1) / 2;    //(1,2) (3,4) ... 이런식으로 두개씩 묶여서 올라가면 다시 1부터 번호가 매겨지므로 각 번호에 1을 더한후 2로 나눈 몫이 다음 번호가 된다.
            b = (b + 1) / 2;
            answer++;           //라운드 진행횟수
            if (a == b)         //같으면 반복문 탈출
                break;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(8,4,7));
    }
}
