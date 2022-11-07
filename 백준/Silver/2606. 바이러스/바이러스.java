import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int s, e;
    static int count = 0;
    static boolean visited[];
    static List<Integer> list[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        list = new List[N+1];
        visited = new boolean[N+1];

        for (int i=1; i<N+1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i=1; i<M+1; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            list[s].add(e);
            list[e].add(s);
        }
    }

    static void DFS(int node) {
        if (visited[node]) {
            return;
        }

        visited[node] = true;

        for (int i:list[node]) {
            if (!visited[i]) {
                count++;
                DFS(i);
            }
        }
    }

    static void logic() {
        DFS(1);
        sb.append(count);
        System.out.println(sb);
    }
}