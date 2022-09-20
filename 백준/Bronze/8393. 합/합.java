// i=0으로 시작하면 X
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, sum;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        for (int i=1; i<=N; i++) {
            sum += i;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
