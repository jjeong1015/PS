import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int t;
    static int x[], y[];
    static int sum[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        t = Integer.parseInt(br.readLine());
        x = new int[t];
        y = new int[t];
        sum = new int[t];
        
        for (int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            sum[i] = x[i] + y[i];
        }
    }

    static void logic() {
        for (int i=0; i<t; i++) {
            sb.append(sum[i]).append("\n");
        }
        System.out.println(sb);
    }
}
