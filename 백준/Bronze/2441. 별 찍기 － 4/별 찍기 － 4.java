import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
    }

    static void logic() {

        for (int i=N; i>0; i--) { // 가로
            for (int j=i; j<N; j++) {
                sb.append(" ");
            }

            for (int j=N-i; j<N; j++) { // i+j=N
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}