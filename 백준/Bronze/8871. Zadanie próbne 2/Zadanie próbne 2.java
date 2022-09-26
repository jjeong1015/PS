import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, max, min;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    static void logic() {
        sb = new StringBuilder();
        min = 0;
        max = 0;
        for (int i=0; i<N; i++) {
            min = N * 2 + 2;
            max = N * 3 + 3;
        }
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}

