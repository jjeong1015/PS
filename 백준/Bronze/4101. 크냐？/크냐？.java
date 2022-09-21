// while문 -> 종료 조건을 알고, 반복문의 횟수를 모를 때 사용
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int Test1, Test2;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
    }
    static void logic() throws IOException {
        while (true) {
            st = new StringTokenizer(br.readLine());
            Test1 = Integer.parseInt(st.nextToken());
            Test2 = Integer.parseInt(st.nextToken());

            if ((Test1 == 0) && (Test2 == 0)) {
                break;
            }

            if (Test1 > Test2) {
                sb.append("Yes").append("\n");
            }
            else {
                sb.append("No").append("\n");
            }
        }
        System.out.println(sb);
    }
}
