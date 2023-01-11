import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int A, B, V;
    static int count = 0, result = 0;
    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        /*
        while (true) { // 시간 초과 발생
            result += A;
            ++count;
            if (result >= V) break;
            result -= B;
        }*/
        int count = (V - B) / (A - B); // 정상 - 미끄러짐 / 올라감 - 미끄러짐
        if ((V - B) % (A - B) != 0) ++count;
        sb.append(count);
        System.out.println(sb);
    }
}