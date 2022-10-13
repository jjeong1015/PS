import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, count, copy;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        count = 0;
        copy = N;
    }

    static void logic() {
        sb = new StringBuilder();
        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            // (N % 10) * 10) : 십의 자릿수, ((N / 10) + (N % 10)) % 10 : 일의 자릿수
            count++;
        } while (copy != N);

        sb.append(count);
        System.out.println(sb);
    }
}