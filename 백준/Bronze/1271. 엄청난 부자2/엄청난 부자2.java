// 1. 조건 확인 제대로 X -> 10^1000 =10,000,000,000
// 2. N과 M을 int가 아니라 String으로 받아야 함 (BigInteger 사용)
// 3. sb = new StringBuilder(); input에 선언 꼭 하기

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static StringBuilder sb;
    static StringTokenizer st;
    static BufferedReader br;
    static int quo, re;
    static String N; //= Integer.parseInt(st.nextToken());
    static String M; //= Integer.parseInt(st.nextToken());

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        N =  st.nextToken();
        M =  st.nextToken();
    }

    static void logic() {
        BigInteger Big_N = new BigInteger(N);
        BigInteger Big_M = new BigInteger(M);
        sb.append(Big_N.divide(Big_M)).append("\n").append(Big_N.remainder(Big_M));
        System.out.println(sb);
    }
}