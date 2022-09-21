import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
    }
    static void logic() {
        for (int i=1; i<=N; i++) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
