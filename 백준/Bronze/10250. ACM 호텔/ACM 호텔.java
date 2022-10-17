import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int T, H, W, N, Y, count, ACM[][];

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken()); // 호텔의 층 수
            W = Integer.parseInt(st.nextToken()); // 각 층의 방 수
            N = Integer.parseInt(st.nextToken()); // 몇 번째 손님
            Y = 1;

            ACM = new int[H + 1][W + 1];
            for (int j = 1; j <= H; j++) {
                Y += (100 * j); // 최소 100의 자릿수(1호실 먼저 채움)부터 시작하므로 곱해주기

                for (int k = 1; k <= W; k++) {
                    ACM[j][k] = Y++;
                }
                Y = 1;
            }

            count = 0;
            for (int j = 1; j <= W; j++) {
                for (int k = 1; k <= H; k++) {
                    count++;
                    if (count == N) {
                        System.out.println(ACM[k][j]);
                        break;
                    }
                }
            }
        }
    }
}