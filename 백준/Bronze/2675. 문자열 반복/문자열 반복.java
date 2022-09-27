import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int T, R;
    static String S, S_arr[];

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            input();
            logic();
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void input() throws IOException {
        //R = new int[T];
        //S = new String[T];
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        S = st.nextToken();
    }

    static void logic() {
        S_arr = new String[S.length()];
        S_arr = S.split("");
        for (int i=0; i<S.length(); i++) {
            for (int j=0; j<R; j++) { // R값만큼 반복해서 받기 위해
                sb.append(S_arr[i]); //
            }
        }
    }
}