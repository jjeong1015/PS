// 1줄이 증가할 때마다 *이 증가하게 하려면 count를 세서 붙여주기
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        int count = 0;
        for (int i=0; i<N; i++) {
            sb.append("*");
            for (int j=0; j<count; j++) {
                sb.append("*");
            }
            sb.append("\n");
            count++;
        }
        System.out.println(sb);
    }
}