import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, arr[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
    }

    static void logic() {
        sb = new StringBuilder();
        Arrays.sort(arr);
        for (int i=0; i<N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);
    }
}