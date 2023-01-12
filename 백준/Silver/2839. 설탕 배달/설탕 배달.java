import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    
    public static void main (String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
    }

    static void logic() {
        // https://st-lab.tistory.com/72
        if (N == 4 || N == 7) {
            sb.append(-1);
        }
        else if (N % 5 == 0) {
            sb.append(N / 5);
        }
        else if (N % 5 == 1 || N % 5 == 3) { // 5의 배수 + 1 / + 3 -> n을 5로 나눈 몫 + 1 -> 최소 봉지 개수
            sb.append((N / 5) + 1);
        }
        else if (N % 5 == 2 || N % 5 == 4) { // 5의 배수 + 2 / + 4 -> n을 5로 나눈 몫 + 2 -> 최소 봉지 개수
            sb.append((N / 5) + 2);
        }
        System.out.println(sb);
    }
}
