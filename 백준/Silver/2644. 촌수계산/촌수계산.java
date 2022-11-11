import java.io.*;
import java.util.*;

public class Main {
    // https://myeongju00.tistory.com/18
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int n, m;
    static int link_x, link_y;
    static int x, y; // s, e
    static int answer = -1;
    static boolean visited[];
    static List<Integer> list[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        link_x = Integer.parseInt(st.nextToken());
        link_y = Integer.parseInt(st.nextToken());

        list = new List[n+1];
        visited = new boolean[n+1];

        for (int i=1; i<n+1; i++) {
            list[i] = new ArrayList<Integer>();
        }

        m = Integer.parseInt(br.readLine());
        for (int i=1; i<m+1; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }
    }

    static void DFS(int node, int count) { // 연결될 수 없는 경우 -1 출력
        visited[node] = true;
        // sb.append(list[node]).append(" "); // 7-2 /  2-1,7,8,9 / 1-2,3 / 3-1
        for (int i:list[node]) {
            if (!visited[i]) { // 방문하지 않았을 경우
                if (i == link_y) { // 도착할 경우
                    answer = count + 1;
                    return;
                }
                DFS(i, count + 1);
            }
        }
    }

    static void logic() {
        DFS(link_x, 0); // 시작 정점, 촌 수
        sb.append(answer);
        System.out.println(sb);
    }
}