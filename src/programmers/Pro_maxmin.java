package programmers;

public class Pro_maxmin {
    public static String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String [] str = s.split(" ");   //문자열을 공백 기준으로 잘라서 str에 저장

        for(int i = 0;i<str.length;i++){
            max = Math.max(Integer.parseInt(str[i]),max);   //최댓값 비교
            min = Math.min(Integer.parseInt(str[i]),min);   //최솟값 비교
        }
        answer = min+" " +max;
        return answer;
    }

    public static void main(String [] args){
        String s = "1 2 3 4";
        System.out.println(solution(s));
    }
}
