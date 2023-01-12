import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    static int length;
    static String str[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        str = new String[T];
        for (int i=0; i<T; i++) {
            str[i] = br.readLine();
        }
    }

    static void logic() {
        for (int i=0; i<T; i++) {
            if (str[i].length() == 1) {
                sb.append(str[i]).append(str[i]).append("\n");
            }
            else {
                length = str[i].length();
                sb.append(str[i].charAt(0)).append(str[i].charAt(length-1)).append("\n");
            }
        }
        System.out.println(sb);
    }
}