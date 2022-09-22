import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sb = new StringBuilder();
        sb.append(A+B).append("\n").append(A-B).append("\n").append(A*B).append("\n").append(A/B).append("\n").append(A%B).append("\n");
        System.out.println(sb);
    }
}
