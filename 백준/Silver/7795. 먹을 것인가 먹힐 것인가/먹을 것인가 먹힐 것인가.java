import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int A, B, A_arr[], B_arr[];
    static int L, R, X, Cnt;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            input();
            logic();

        }
    }

    static void input() throws IOException {
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A_arr = new int[A];
        for (int i=0; i<A; i++) {
            A_arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        B_arr = new int[B];
        for (int i=0; i<B; i++) {
            B_arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B_arr);
    }
    static int lower_bound(int B_arr[], int L, int R, int X) { // L:0 R:3
        // lower_bound(int A_arr[], int B_arr[], int L, int R, int X)
        // lower bound -> 사용 이유
        while (L < R) { // B < A
            int mid = (L + R) / 2;
            if (B_arr[mid] >= X) R = mid;
            else L = mid + 1;
        }
        return L;
    }
    static void logic() {
        // https://colorscripter.com/s/JKpc5pT
        Cnt = 0;
        for (int i=0; i<A_arr.length; i++) {
            //System.out.print(lower_bound(B_arr, 0, B, A_arr[i]) + " ");
            Cnt += lower_bound(B_arr, 0, B, A_arr[i]);
            // B_arr[i] (X) / B_arr (O) -> [i]를 돌릴 경우 for문 2번(ex) 8-3, 8-6, 8-1)이 돌아가지 않고 8-3만 돌아감
        }
        sb.append(Cnt);
        System.out.println(sb);
    }
}
