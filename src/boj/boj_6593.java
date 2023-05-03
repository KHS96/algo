package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_6593 {
    static char map[][][];
    static int dist[][][];
    //    static int z, x, y;
    static int[] dx = {0, 0, -1, 0, 1, 0};
    static int[] dy = {0, 0, 0, 1, 0, -1};
    static int[] dz = {-1, 1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int start_x = 0;
            int start_y = 0;
            int start_z = 0;

            int end_x = 0;
            int end_y = 0;
            int end_z = 0;

            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(l==0 && r==0 && c==0)
                break;

            map = new char[l][r][c];
            dist = new int[l][r][c];

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < r; j++) {
                    String temp = br.readLine();
                    for (int k = 0; k < c; k++) {
//                        System.out.println(temp.charAt(k));
                        if (temp.charAt(k) == 'S') {
                            start_z = i;
                            start_x = j;
                            start_y = k;
                        }
                        if (temp.charAt(k) == 'E') {
                            end_z = i;
                            end_x = j;
                            end_y = k;
                        }
                        map[i][j][k] = temp.charAt(k);
                    }
                }
                String space = br.readLine();
            }
            //dist[start_x][start_y][start_z] = 0;
            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{start_z, start_x, start_y});

            while (!q.isEmpty()) {
                int[] temp = q.poll();
                int z = temp[0];
                int x = temp[1];
                int y = temp[2];

                for (int i = 0; i < 6; i++) {
                    int nz = z + dz[i];
                    int nx = x + dx[i];
                    int ny = y + dy[i];


                    if (nx < 0 || ny < 0 || nz < 0 || nx >= r || ny >= c || nz >= l) continue;
                    if (map[nz][nx][ny] == '#' || dist[nz][nx][ny] != 0) continue;
                    q.offer(new int[]{nz, nx, ny});
                    dist[nz][nx][ny] = dist[z][x][y] + 1;
                }

            }
            int ans = dist[end_z][end_x][end_y];

            if(ans== 0)
                System.out.println("Trapped!");
            else{
                System.out.println("Escaped in " + ans + " minute(s).");
            }

        }


    }

}
