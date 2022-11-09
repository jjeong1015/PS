import java.io.*;
import java.util.*;

public class Main {
    // https://zzang9ha.tistory.com/58
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int count = 0;
    static String str;
    static int map[][];
    static boolean visited[][];
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        map = new int[25][25];
        visited = new boolean[25][25];

        for (int i=0; i<N; i++) {
            str = br.readLine();
            for (int j=0; j<N; j++) {
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    DFS(i, j);
                    count++; // 재귀 함수가 끝날 때 탐색이 끝났으므로 다음 인접된 집의 단지 번호 1 증가
                }
            }
        }
        sb.append(count).append("\n"); // 단지 수

        int arr[] = new int[count+1]; // 단지 수 만큼 집의 수 설정
        // 초기값을 count=1이 아닌 0으로 함
        // count-1으로 한 코드에서는 arr 크기 잡을 때 count로 하여 해당 코드에서는 count+1로 함

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (map[i][j] != 0) { // 집이 있을 경우
                    arr[map[i][j]]++; // 단지 번호 저장
                }
            }
        }

        Arrays.sort(arr);
        for (int i=1; i<count+1; i++) {
            sb.append(arr[i]).append("\n"); // 각 단지 번호 별로 단지 수 출력
        }
        System.out.println(sb);
    }

    static void DFS(int x, int y) {
        int nx, ny;
        visited[x][y] = true;
        map[x][y] = count+1; // 방문한 집 count 표시

        for (int i=0; i<4; i++) {
            nx = x + dx[i];
            ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    DFS(nx, ny);
                }
            }
        }
    }
}