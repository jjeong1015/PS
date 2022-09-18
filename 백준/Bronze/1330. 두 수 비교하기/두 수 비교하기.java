import java.io.*;
import java.util.*;

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
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        // 1. 양 vs 양 2. 양 vs 음 3. 음 vs 음 -> 절댓값으로 비교
        if (A > B) {
            sb.append(">");
            System.out.println(sb);
        }
        else if (A < B) {
            sb.append("<");
            System.out.println(sb);
        }
        else if (A == B) {
            sb.append("==");
            System.out.println(sb);
        }
    }
}