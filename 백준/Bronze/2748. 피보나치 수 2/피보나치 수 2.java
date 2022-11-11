import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int n;
    static long f1 = 0, f2 = 1, fn = 1;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
    }

    static void logic() {
        for (int i=1; i<n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        sb.append(fn);
        System.out.println(sb);
    }
}