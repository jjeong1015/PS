import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int count = 1; // 층 수
    static int range = 2; // 범위 (최솟값 기준)

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
    }

    static void logic() {
        if (N == 1) {
            sb.append("1");
        }
        else {
            while (range <= N) {
                range = range + (6 * count);
                count++;
            }
            sb.append(count);
        }
        System.out.println(sb);
    }
}