import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M; // 정점 개수, 간선 개수
    static int s, e; // 간선 양 끝점(u, v)
    static int count = 0; // 연결 요소 개수
    static boolean visited[]; // 방문 배열
    static ArrayList<Integer> A[];

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
        visited = new boolean[N+1];
        A = new ArrayList[N+1];
        for (int i=1; i<N+1; i++) { // A 인접 리스트의 각 ArrayList 초기화
            A[i] = new ArrayList<Integer>();
        }
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken()); // u
            e = Integer.parseInt(st.nextToken()); // v

            A[s].add(e); // s-e ex) 1-2 / 2-5 / 5-1 / 3-4 / 4-6
            A[e].add(s); // e-s ex) 2-1 / 5-2 / 1-5 / 4-3 / 6-4
        }
    }

    static void DFS(int v) {
        if (visited[v]) {  // 연결 노드 중 방문하지 않았던 노드만 탐색 (현재 노드 = 방문 노드)
            return;
        }
        visited[v] = true; // visited 배열에 현재 노드 방문 기록
        for (int i:A[v]) {
            if (visited[i] == false) { // 현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행
                DFS(i);
            }
        }
    }

    static void logic() {
        for (int i=1; i<N+1; i++) {
            if (!visited[i]) { // 방문하지 않은 노드가 없을 때까지 반복
                count++; // 연결 요소 개수 증가
                DFS(i);
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}