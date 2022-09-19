// N_mul 배열 크기를 9로 잡고 for문 조건을 0~8까지 잡음 그리고 i+=1을 해서 1~9로 돌게 하려고 했더니 범위 문제 발생
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N,N_mul[];

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
        N_mul = new int[10];
        for (int i=1; i<10; i++) {
            //i += 1;
            N_mul[i] = N * i;
            sb.append(N + " * " + i + " = " + N_mul[i] + "\n");
        }
        System.out.println(sb);
    }
}
