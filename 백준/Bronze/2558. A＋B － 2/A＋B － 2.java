import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        B = Integer.parseInt(st.nextToken());
    }
    static void logic() {
        sb.append(A+B);
        System.out.println(sb);
    }
}