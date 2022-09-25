import java.io.*;
import java.util.*;
import java.math.*;

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
        st = new StringTokenizer(br.readLine());
        A = st.nextToken();
        B = st.nextToken();
    }

    static void logic() {
        sb = new StringBuilder();

        BigInteger Big_A = new BigInteger(A);
        BigInteger Big_B = new BigInteger(B);
        sb.append(Big_A.multiply(Big_B)).append("\n");
        System.out.println(sb);
    }
}
