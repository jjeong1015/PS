import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static String S;
    static int S_arr[], location;
    static char ch;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        S = br.readLine();
    }

    static void logic() {
        sb = new StringBuilder();
        S_arr = new int[26];

        for (int i=0; i<S_arr.length; i++) {
            S_arr[i] = -1;
        }

        for (int i=0; i<S.length(); i++) {
            ch = S.charAt(i);

            if(S_arr[ch - 'a'] == -1) { // 중복되는 문자라면 S_arr에 값으로 들어갈 수 없음
                S_arr[ch - 'a'] = i; // arr의 index는 a~z 순서이기 때문에 a를 빼줌
            }
        }

//        for (int location : S_arr) {
//            sb.append(location + " ");
//        }

        for (char c='a'; c<='z'; c++) {
            sb.append(S.indexOf(c) + " ");
        }
        System.out.println(sb);
    }
}
