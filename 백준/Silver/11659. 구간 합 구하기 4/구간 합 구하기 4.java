import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, M;
    static int s, e;
    static int sum[];
    static int arr[];

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 수의 개수
        M = Integer.parseInt(st.nextToken()); // 합을 구해야 하는 횟수

        arr = new int[N+1]; // 수
        sum = new int[M+1]; // 합

        st = new StringTokenizer(br.readLine());
        /*
        for (int i=1; i<N+1; i++) { // 수 입력
            arr[i] = Integer.parseInt(st.nextToken());
        }
        */

        for (int i=1; i<N+1; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i=1; i<M+1; i++) { // 구간 잡기
            st = new StringTokenizer(br.readLine());
            s = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            sb.append(arr[e] - arr[s-1]).append("\n");
        }
        System.out.println(sb);
    }
}