import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static double A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        A = Double.parseDouble(st.nextToken());
        B = Double.parseDouble(st.nextToken());
    }
    static void logic() {
        sb.append(A / B);
        System.out.println(sb);
    }
}