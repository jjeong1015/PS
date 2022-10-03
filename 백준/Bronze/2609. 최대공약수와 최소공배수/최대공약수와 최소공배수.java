import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A, B;

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
    }

    static int gcd(int A, int B) { // 최대공약수
        if (B==0) return A;
        else return gcd(B, A%B);
    }

    static void logic() {
        sb.append(gcd(A, B)).append("\n"); // 최대공약수
        sb.append(A * B / gcd(A, B)); // 최소공배수
        System.out.println(sb);
    }
}