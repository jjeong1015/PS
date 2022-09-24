import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T, A[], B[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        A = new int[T+1];
        B = new int[T+1];
        for (int i=1; i<=T; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        for (int i=1; i<=T; i++) {
            sb.append("Case #" + i +": ").append(A[i] + " + " + B[i] + " = ").append(A[i]+B[i]).append("\n");
        }
        System.out.println(sb);
    }
}

