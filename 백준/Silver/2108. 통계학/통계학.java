import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N, N_arr[], count;
    static double sum, average;
    static int median, mode, range;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        N_arr = new int[N];
        sum = 0;
        for (int i=0; i<N; i++) {
            N_arr[i] = Integer.parseInt(br.readLine());
            //sb.append(N_arr[i]).append(" "); // 값 제대로 들어감
            sum += N_arr[i];
        }
    }

    static void logic() {
        // https://comain.tistory.com/256
        Arrays.sort(N_arr);
        average = Math.round(sum / N); // ex) (0 + 0 + (-1)) / 3 = -0.333333... 이고 이를 첫째 자리에서 반올림하면 0
        sb.append(Math.round(average)).append("\n"); // 평균

        median = N_arr[(N-1) / 2];
        sb.append(median).append("\n"); // 중앙값

        count = 0;
        mode = N_arr[0];
        boolean check = false;
        int max = -1;
        //int min = N_arr[0];

        for (int i=0; i<N-1; i++) { // 최빈값
            if (N_arr[i] == N_arr[i+1]) {
                count++;
            }
            else {
                count = 0;
            }

            if (max < count) {
                max = count;
                mode = N_arr[i];
                check = true;
            }
            else if (max == count && check == true) {
                mode = N_arr[i];
                check = false;
            }
        }
        sb.append(mode).append("\n");
        
        range = (N_arr[N-1] - N_arr[0]); // 범위
        sb.append(range).append("\n");
        System.out.println(sb);
    }
}