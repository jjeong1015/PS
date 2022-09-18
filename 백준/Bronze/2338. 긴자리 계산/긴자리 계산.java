// 1. BigInteger 사용 시 math 라이브러리 쓰기
// 2. 수가 엄청 클 때 BigInteger의 존재를 생각하기

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static String A, B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        A = st.nextToken();
        st = new StringTokenizer(br.readLine());
        B = st.nextToken();

    }

    static void logic() {
        BigInteger Big_A = new BigInteger(A);
        BigInteger Big_B = new BigInteger(B);
        sb.append(Big_A.add(Big_B)).append("\n").append(Big_A.subtract(Big_B)).append("\n").append(Big_A.multiply(Big_B));
        System.out.println(sb);
    }
}
