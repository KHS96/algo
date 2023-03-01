package programmers;

public class Pro_12914 {
    public static long solution(int n) {
        long answer = 0;
        int [] arr=  new int[2001];

        arr[1]=1;
        arr[2]=2;

        for(int i=3;i<2001;i++){
            arr[i] = (arr[i-2]+arr[i-1])%1234567;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
