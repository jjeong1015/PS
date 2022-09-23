import java.io.*;
import java.util.*;
// >>>>>>> 이분탐색 전에 정렬 <<<<<<< 제발 꼭 잊지 말기
public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, M;
    static int A[], A_exist[];
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        A_exist = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            A_exist[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        //Arrays.sort(A_exist);

//        for (int i=0; i<N; i++) {
//            sb.append(A[i]).append(" ");
//        }
//        sb.append("\n");
//        for (int i=0; i<M; i++) {
//            sb.append(A_exist[i]).append(" ");
//        }
//        System.out.println(sb);
    }
    static int lower_bound(int A[], int L, int R, int A_exist) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (A[mid] >= A_exist) {
                R = mid;
            }
            else {
                L = mid + 1;
            }
        }
        return L;
    }

    static int upper_bound(int A[], int L, int R, int A_exist) {
        while (L < R) {
            int mid = (L + R) / 2;
            if (A[mid] > A_exist) {
                R = mid;
            }
            else {
                L = mid + 1;
            }
        }
        return L;
    }
    static void logic() {
        for (int i=0; i<M; i++) {
            sb.append(upper_bound(A, 0, A.length, A_exist[i])-lower_bound(A, 0, A.length, A_exist[i])).append(" ");
        }
        System.out.println(sb);
    }
}
