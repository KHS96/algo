package programmers;

import java.util.*;

public class Pro_138476 {

    public static int solution(int k, int[] tangerine) {
        int[] num = new int[10000001];  // 원소의 길이가 10,000,000 이하이므로 최대 길이 설정
        int answer = 1;                 // 기본값 1 설정
        for (int n : tangerine) {       // tangerine의 길이만큼 돌면서 해당 숫자에 해당하는 배열의 값을 플러스
            num[n]++;
        }
        Arrays.sort(num);               // num 배열을 정렬

        for (int i = 10000000; i > 0; i--) {    // 배열에 저장된 큰 숫자 부터 시작
            if (num[i] >= k) {                  // 만약 k(귤의 개수) 보다 num[i]가 크면 한종류만 있어도 되므로 종료
                break;
            } else {                            // 그렇지 않다면 해당 크기에 해당하는 귤의 개수만큼 빼주고 종류(answer)를 1개 증가
                k -= num[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int k = 6;
        int []tangerine = {1,3,2,5,4,5,2,3};

        System.out.println(solution(k,tangerine));
    }

}
