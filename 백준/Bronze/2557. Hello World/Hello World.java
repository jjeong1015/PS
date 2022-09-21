// input()에 sb 꼭 사용 및 출력하기
import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        sb.append("Hello World!");
        System.out.println(sb);

    }

    static void logic() {

    }
}