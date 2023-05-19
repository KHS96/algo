package note;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class note2 {
    static int[] out = new int[2];

    public static void main(String[] args) {
//        int n = 3;
        int[] arr = {1, 2, 3};
        boolean[] visit = new boolean[3];

        perm(arr, visit, 0, 2);
    }

    static void perm(int[] arr, boolean[] visit, int depth, int r) {
        if (depth == r) {
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visit[i] != true) {
                visit[i] = true;
                out[depth] = arr[i];
                perm(arr, visit, depth + 1, r);
                visit[i] = false;
            }
        }
    }


}
