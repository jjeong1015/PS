import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int temp1, temp2;
    static Queue<Integer> que = new LinkedList<>();

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
        for (int i=1; i<=N; i++) {
            que.offer(i);
        }

        while (que.size() > 1) {
            temp1 = que.poll();
            temp2 = que.poll();
            que.offer(temp2);
        }
        sb.append(que.poll());
        System.out.println(sb);
    }
}