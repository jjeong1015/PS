import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static double first, second;

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
        first = N * 0.78;
        second = N * 0.8 + N * 0.2 * 0.78;
        sb.append((int)first).append(" ").append((int)second);
        System.out.println(sb);
    }
}