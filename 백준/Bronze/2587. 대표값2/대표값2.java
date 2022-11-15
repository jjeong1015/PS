import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int num[];
    static int sum, avg;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        num = new int[5];
        for (int i=0; i<5; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        sum = 0;
        for (int i=0; i<5; i++) {
            sum += num[i];
        }
        avg = sum / 5;
        sb.append(avg).append("\n");
        Arrays.sort(num);
        sb.append(num[2]);
        System.out.println(sb);
    }
}