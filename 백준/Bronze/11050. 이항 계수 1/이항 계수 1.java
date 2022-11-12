import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, K;
    static int N_mul = 1, K_mul = 1, NK_mul = 1;
    static int result;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        // N!/k!(N-K)!
        if (N <= 10 && K <= N) {
            for (int i=1; i<=N; i++) {
                N_mul *= i;
                //sb.append("N_mul : ").append(N_mul).append("\n");
            }
            for (int i=1; i<=K; i++) {
                K_mul *= i;
                //sb.append("K_mul : ").append(K_mul).append("\n");
            }
            for (int i=1; i<=(N-K); i++) {
                NK_mul *= i;
                //sb.append("NK_mul : ").append(NK_mul).append("\n");
            }
            result = N_mul / (K_mul * NK_mul);
            sb.append(result);
            System.out.println(sb);
        }
    }
}