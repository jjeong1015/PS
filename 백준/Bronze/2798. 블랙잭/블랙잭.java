import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, M, card[], sum;
    static int max = 0;

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
        st = new StringTokenizer(br.readLine());
        card = new int[N];
        for (int i=0; i<N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        for (int i=0; i<N; i++) {
            for (int j=i+1; j<N; j++) {
                for (int k=j+1; k<N; k++) {
                    sum = card[i] + card[j] + card[k];
                    if (sum <= M && sum > max) {
                        max = card[i] + card[j] + card[k];
                    }
                }
            }
        }
        sb.append(max);
        System.out.println(sb);
    }
}