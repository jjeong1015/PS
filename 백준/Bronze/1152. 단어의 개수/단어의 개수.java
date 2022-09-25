import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static String word, token;
    static int i;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        // 토큰 단위 개수 셀 경우 StringTokenizer(해당 문자열, " ") 후
        // while(hasMoreTokens())에 token = st.nextToken() 넣어주고 카운트하기
        word = br.readLine();
        st = new StringTokenizer(word, " ");
    }

    static void logic() {
        sb = new StringBuilder();
        i = 0;
        while(st.hasMoreTokens()) {
            token = st.nextToken();
            i++;
        }
        sb.append(i);
        System.out.println(sb);
    }
}
