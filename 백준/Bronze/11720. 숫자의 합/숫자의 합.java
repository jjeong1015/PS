import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, sum;
    static String num;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        num = br.readLine();
    }

    static void logic() {
        sum = 0;
        for(int i=0; i<N; i++) {
            sum += num.charAt(i) -'0';
        }
        sb.append(sum);
        System.out.println(sb);
    }
}