// &&을 해야 하는데 ||를 해버림
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;

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

        if (N>=90 && N<=100) {
            sb.append("A");
            System.out.println(sb);
        }
        else if (N>=80 && N<90) {
            sb.append("B");
            System.out.println(sb);
        }
        else if (N>=70 && N<80) {
            sb.append("C");
            System.out.println(sb);
        }
        else if (N>=60 && N<70) {
            sb.append("D");
            System.out.println(sb);
        }
        else {
            sb.append("F");
            System.out.println(sb);
        }
    }
}
