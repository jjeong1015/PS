import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int[] num;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        num = new int[2];
        for(int i=0; i<2; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
    }
    static void logic() {
        sb.append(num[0] - num[1]);
        System.out.println(sb);
    }
}