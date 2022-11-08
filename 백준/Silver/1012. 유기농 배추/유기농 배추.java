import java.io.*;
import java.util.*;

public class Main {
    // https://lotuus.tistory.com/98
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int M, N, K;
    static int X, Y;
    static int count = 0;
    static int map[][];
    static boolean visited[][];
    // 배추가 상하좌우에 인접하면 이동 가능 -> 현재 좌표 기준으로 상하좌우 움직이는 좌표 지정
    static int dx[] = {0, 0, -1, 1}; // 가로 (상, 하, 좌, 우) -> 좌, 우로만 이동
    static int dy[] = {1, -1, 0, 0}; // 세로 (상, 하, 좌, 우) -> 상, 하로만 이동

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[M][N];
            visited = new boolean[M][N];

            for (int j=0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                X = Integer.parseInt(st.nextToken()); // X<=M
                Y = Integer.parseInt(st.nextToken()); // Y<=N

                map[X][Y] = 1;
            }

            for (int a=0; a<M; a++) { // 배추흰지렁이
                for (int b=0; b<N; b++) {
                    if (map[a][b] == 1 && !visited[a][b]) {
                        count++;
                        visited[a][b] = true;
                        DFS(a, b);
                    }
                }
            }

            sb.append(count).append("\n");
            count = 0;
        }
        System.out.println(sb);
    }

    static void DFS(int x, int y) {
        int nx, ny;

        for (int i=0; i<4; i++) { // 상하좌우(4가지)이기 때문에 4번 돌기
            // 상하좌우 좌표 조정
            nx = x + dx[i];
            ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N) { // 범위 체크 (하지 않을 경우 범위 오류 -1 발생)
                if (map[nx][ny] == 1 && !visited[nx][ny]) { // 배추가 있고 방문하지 않은 곳
                    visited[nx][ny] = true;
                    DFS(nx, ny);
                }
            }
        }
    }
}