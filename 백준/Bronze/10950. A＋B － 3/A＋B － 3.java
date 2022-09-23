import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int A[], B[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        A = new int[T];
        B = new int[T];
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        sb = new StringBuilder();
        for (int i=0; i<T; i++) {
            sb.append(A[i] + B[i]).append("\n");
        }
        System.out.println(sb);
    }
}
