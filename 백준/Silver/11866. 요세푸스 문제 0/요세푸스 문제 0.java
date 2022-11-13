import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, K;
    static Queue<Integer> que = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        for (int i=1; i<=N; i++) {
            que.offer(i);
        }

        sb.append("<");

        while (que.size() > 1) {
            for (int i=0; i<K-1; i++) { // 해당 리스트에서 K번째 값 계속 제거
                int temp = que.poll(); // 큐 맨 앞에 있는 값 반환 후 삭제
                que.offer(temp); // 해당 큐 맨 뒤에 삽입
            }
            sb.append(que.poll()).append(", ");
        }
        sb.append(que.poll()).append(">");
        System.out.println(sb);
    }
}