import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int year;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        year = Integer.parseInt(st.nextToken());
    }
    static void logic() {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                sb.append("1");
                System.out.println(sb);
            }
            else if (year % 400 == 0) {
                sb.append("1");
                System.out.println(sb);
            }
            else {
                sb.append("0");
                System.out.println(sb);
            }
        }
        else {
            sb.append("0");
            System.out.println(sb);
        }
    }
}