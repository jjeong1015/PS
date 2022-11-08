import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
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
        B = st.nextToken();
    }

    static void logic() {
        BigInteger Big_A = new BigInteger(A);
        BigInteger Big_B = new BigInteger(B);
        sb.append(Big_A.add(Big_B)).append("\n");
        System.out.println(sb);
    }
}