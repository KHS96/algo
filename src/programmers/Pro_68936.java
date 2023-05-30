package programmers;

public class Pro_68936 {
    static int zero, one;

    public static int[] solution(int[][] arr) {
        int[] answer = new int[2];


        part(0, 0, arr.length, arr);

        answer[0] = zero;
        answer[1] = one;

        return answer;
    }

    public static void part(int row, int col, int size, int[][] arr) {
        if (colorCheck(row, col, size, arr)) {
            if (arr[row][col] == 0) {

                zero++;
            } else {
                one++;
            }
            return;
        }


        int newSize = size / 2;

        part(row, col, newSize, arr);  //2사분면
        part(row, col + newSize, newSize, arr);  //1사분면
        part(row + newSize, col, newSize, arr);  //3사분면
        part(row + newSize, col + newSize, newSize, arr);  //4사분면
    }

    public static boolean colorCheck(int row, int col, int size, int[][] arr) {
        int color = arr[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] != color) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][]arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
        int []ans = solution(arr);
        System.out.println(ans[0]+", "+ ans[1]);
    }
}
