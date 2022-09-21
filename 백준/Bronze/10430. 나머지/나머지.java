// 곱하기는 *임을 잊지 말기, 계산식일 땐 "" 붙이지 않기
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A, B, C;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sb.append((A+B)%C).append("\n");
        sb.append(((A%C) + (B%C))%C).append("\n");
        sb.append((A*B)%C).append("\n");
        sb.append(((A%C) * (B%C))%C).append("\n");
        System.out.println(sb);
    }
}