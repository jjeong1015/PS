import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, M, V;
    static int s, e;
    static boolean visited[];
    static List<Integer> list[];
    static Queue<Integer> que;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        list = new List[N+1];
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
        visited[node] = true;
        sb.append(node).append(" ");

        for (int i:list[node]) {
            if (!visited[i]) { // 방문하지 않은 노드일 경우
                DFS(i);
            }
        }
    }

    static void BFS(int node) {
        que = new LinkedList<Integer>();
        que.add(node); // que 자료구조에 시작 노드 삽입
        visited[node] = true; // 배열에 현재 노드 방문 기록

        while (!que.isEmpty()) {
            int now_node = que.poll(); // que 에서 노드 데이터 가져오기 poll -> 큐 맨 앞에 있는 값 반환 후 삭제
            sb.append(now_node).append(" "); // que 맨 앞에 있는 값 출력
            for (int i:list[now_node]) {
                if (!visited[i]) { // 현재 노드의 연결 노드 중 방문하지 않은 노드를 que에 삽입
                    visited[i] = true; // 방문 배열 체크
                    que.add(i);
                }
            }
        }
    }

    static void logic() {
        for (int i=1; i<N+1; i++) { // 방문할 수 있는 정점이 여러 개인 경우
            Collections.sort(list[i]); // 정점 번호가 작은 것을 먼저 방문
        }

        visited = new boolean[N+1]; // 방문 배열 초기화
        DFS(V);
        sb.append("\n");
        visited = new boolean[N+1]; // 방문 배열 초기화
        BFS(V);
        sb.append("\n");

        System.out.println(sb);
    }
}
