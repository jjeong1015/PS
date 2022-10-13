import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int amount, type, a[], b[], sum;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        amount = Integer.parseInt(br.readLine());
        type = Integer.parseInt(br.readLine());
        a = new int[type];
        b = new int[type];
        for (int i=0; i<type; i++) {
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            sum += a[i] * b[i];
        }
    }

    static void logic() {
        if (sum == amount) {
            sb.append("Yes");
        }
        else {
            sb.append("No");
        }
        System.out.println(sb);
    }
}
