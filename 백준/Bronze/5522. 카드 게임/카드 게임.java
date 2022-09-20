// 배열 크기 지정 꼭 하기
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int A[], sum;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        A = new int[5];
        for(int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void logic() {
        for(int i=0; i<5; i++) {
            sum += A[i];
        }
        sb.append(sum);
        System.out.println(sb);
    }
}