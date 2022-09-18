import java.io.*;
import java.util.*;

public class Main {
    static StringTokenizer st;
    static int N;
    static int M;
    static int A[];
    static int A_exist[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A_exist = new int[M];
        for (int i=0; i<M; i++) {
            A_exist[i] = Integer.parseInt(st.nextToken());
        }

//        System.out.println(Arrays.toString(A));
//        System.out.println(Arrays.toString(A_exist));
    }

    static int binarySearch(int[] A_exist, int L, int R, int X) {
        while (L <= R) {
            int mid = (L + R) / 2;
            if (A_exist[mid] == X) {
                return 1;
            } else if (A_exist[mid] < X) {
                L = mid + 1;
            } else {
                R = mid - 1;
            }
        }
        return 0;
    }

    static void logic() {
        Arrays.sort(A);
        for(int i=0; i<A_exist.length; i++) {
            int ans = binarySearch(A, 0, A.length-1, A_exist[i]);
            System.out.println(ans);
        }
    }
}
