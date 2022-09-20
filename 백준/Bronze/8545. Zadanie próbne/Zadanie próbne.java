// reverse = new StringBuffer(str).reverse().toString(); // 문자열 뒤집기
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static String str, reverse;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        str = br.readLine();
    }

    static void logic() {
        reverse = new StringBuffer(str).reverse().toString(); // 문자열 뒤집기
        sb.append(reverse);
        System.out.println(sb);
    }
}
