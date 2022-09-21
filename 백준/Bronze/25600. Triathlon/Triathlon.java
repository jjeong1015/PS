// Math.max 함수 쓰려고 했으나 쓰레기값 발생
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, a[], d[], g[], sum[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        a = new int[N];
        d = new int[N];
        g = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            d[i] = Integer.parseInt(st.nextToken());
            g[i] = Integer.parseInt(st.nextToken());
        }
        /*
        for (int i = 0; i < N; i++) {
            sb.append(a[i]).append(" ").append(d[i]).append(" ").append(g[i]).append("\n");
        }
        System.out.println(sb);
        */
    }

    static void logic() {

        int max = 0;
        sum = new int[N];
        for (int i=0; i<sum.length; i++) {
            if (a[i] == d[i] + g[i]) {
                sum[i] = 2 * a[i] * (d[i] + g[i]);
            }
            else {
                sum[i] = a[i] * (d[i] + g[i]);
            }

            //System.out.println(sum[i]);
            //sb.append(Math.max(sum[i], max));
        }
        Arrays.sort(sum);
        sb.append(sum[sum.length-1]);
        System.out.println(sb);
    }
}
