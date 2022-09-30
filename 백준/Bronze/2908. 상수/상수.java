import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A, B, answer_A, answer_B;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sb = new StringBuilder();
        answer_A = 0;
        answer_B = 0;
        // 수를 뒤집고 더 큰 수
        while (A != 0) {
            answer_A = answer_A * 10 + A % 10;
            A /= 10;
        }
        //sb.append(answer_A).append(" ");

        while (B != 0) {
            answer_B = answer_B * 10 + B % 10;
            B /= 10;
        }
        //sb.append(answer_B);
        if(answer_A>answer_B) {
            sb.append(answer_A);
        }
        else {
            sb.append(answer_B);
        }
        System.out.println(sb);
    }
}
