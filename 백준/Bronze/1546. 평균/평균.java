import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static int arr[], arr_temp[], max, max_temp[];
    static float sum_sum, avg, sum;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr_temp = new int[N];
        arr = new int[N];
        max = 0;
        for (int i=0; i<N; i++) {
            arr_temp[i] = Integer.parseInt(st.nextToken()); // 점수 입력 받기
            arr[i] = arr_temp[i];
            max = Math.max(arr_temp[i], max); // 입력받은 점수 중 최댓값 찾기
        }
    }

    static void logic() {
        sb = new StringBuilder();
        for (int i=0; i<N; i++) {
            sum += arr[i];
            sum_sum = sum / max * 100;
            //sum[i] = arr[i] / max * 100;
            //System.out.println("sum[" + i + "] : " + sum[i]);
            //sum_sum += sum[i];
        }
        avg = sum_sum / N;
        sb.append(avg);
        System.out.println(sb);
    }
}
