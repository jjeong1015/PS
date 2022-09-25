import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, num[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        num = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        int max = num[0];
        int min = num[0];
        for (int i=0; i<N; i++) {
            max = Math.max(num[i], max);
            min = Math.min(num[i], min);
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}