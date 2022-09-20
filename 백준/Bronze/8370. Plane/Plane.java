import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N1, K1, N2, K2;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N1 = Integer.parseInt(st.nextToken());
        K1 = Integer.parseInt(st.nextToken());
        N2 = Integer.parseInt(st.nextToken());
        K2 = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sb.append((N1*K1)+(N2*K2));
        System.out.println(sb);
    }
}
