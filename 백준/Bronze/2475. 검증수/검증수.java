import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int num1, num2, num3, num4, num5, sum, verify;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        // 검증수 = 각 수의 제곱수의 합을 10으로 나눈 나머지

        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());
        num3 = Integer.parseInt(st.nextToken());
        num4 = Integer.parseInt(st.nextToken());
        num5 = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sum = (num1*num1) + (num2*num2) + (num3*num3) + (num4*num4) + (num5*num5);
        verify = sum % 10;
        sb.append(verify);
        System.out.println(sb);
    }
}