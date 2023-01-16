import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int num;
    static int count;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
    }

    static void logic() {
        num = 666;
        count = 1;
        
        while(count != N) {
            ++num;
            if (String.valueOf(num).contains("666")) {
                ++count;
            }
        }
        sb.append(num);
        System.out.println(sb);
    }
}