// st를 어떻게 사용해야 하나 고민함 -> 단순 문자열 길이 세기면 StringTokenizer 필요 없이 br.readLine()만 사용해서 .length로 길이 구하기
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    //static StringTokenizer st;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        //st = new StringTokenizer(br.readLine(), "");
        sb = new StringBuilder();

        str = br.readLine();
        //System.out.println(str);
    }

    static void logic() {
        sb.append(str.length());
        System.out.println(sb);
    }
}
