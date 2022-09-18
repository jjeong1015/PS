import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static long N, M;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Long.parseLong(st.nextToken());
        M = Long.parseLong(st.nextToken());
    }

    static void logic() {
        if (N-M >= 0) {
            sb.append(N-M);
            System.out.println(sb);
        }
        else if (N-M < 0) {
            sb.append((N-M)*(-1));
            System.out.println(sb);
        }
    }
}
