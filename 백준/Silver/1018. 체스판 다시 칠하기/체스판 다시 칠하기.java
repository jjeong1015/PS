import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int M, N;
    static int min = 64;
    static String str;
    static boolean arr[][];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new boolean[N+1][M+1];

        for (int i = 1; i < N+1; i++) {
            str = br.readLine();
            for (int j = 1; j < M+1; j++) {
                if (str.charAt(j-1) == 'W') { // j-1인 이유 : 배열은 0부터 시작하는데 공간 하나를 늘려주고 1부터 시작.
                    // 범위를 M 대신 M+1 까지 해도 charAt 시작점은 0이기 때문에 -1를 해줌
                    arr[i][j] = true;
                }
                else {
                    arr[i][j] = false;
                }
            }
        }
    }

    static void find(int x, int y) {
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;

        boolean TF = arr[x+1][y+1];

        for (int i = x; i < end_x; i++) {
            for (int j = y; j < end_y; j++) {
                if (arr[i][j] != TF) {
                    count++;
                }
                TF = (!TF);
            }
            TF = !TF;
        }
        count = Math.min(count, 64 - count);
        min = Math.min(min, count);
    }

    static void logic() {
        int N_row = N - 7; // 열
        int M_col = M - 7; // 행

        for (int i=1; i<=N_row; i++) {
            for (int j=1; j<=M_col; j++) {
                find(i, j);
            }
        }
        sb.append(min);
        System.out.println(sb);
    }
}
