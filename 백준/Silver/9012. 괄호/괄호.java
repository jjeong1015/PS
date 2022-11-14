import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int T;
    //static int count1 = 0, count2 = 0;
    static String str, str_arr[];

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int count1 = 0, count2 = 0;
            int x = 0;
            str = br.readLine();
            str_arr = str.split("");
            if (str.length() % 2 == 0) { // 문자열 길이가 짝수일 경우 진행
                for (int j = 0; j < str_arr.length; j++) { // 왜 시발 count 올라가질 않니 개빡치게 하네 진짜 개시발아
                    if (str_arr[j].equals("(")) { // 큰 따옴표일 경우 먹지 않음 -> 작은 따옴표 써야 함
                        ++count1;
                        //sb.append("( 존재").append("\n");
                    }
                    if (str_arr[j].equals(")")) { // 큰 따옴표 String, 작은 따옴표 char
                        ++count2;
                        //sb.append(") 존재").append("\n");
                    }
                    if (count2 > count1) { // ')'이게 먼저 나오면 안됨 -> 무조건 '('이 먼저 나와야 함
                        ++x; // ex) )( 일 경우 X
                    }
                }

                if (count1 == count2 && x == 0) {
                    //sb.append("짝수 : ").append(" ");
                    //sb.append("count1 : ").append(count1).append(" ");
                    //sb.append("count2 : ").append(count2).append(" ");
                    sb.append("YES").append("\n");
                }
                else {
                    //sb.append("짝수 : ").append(" ");
                    sb.append("NO").append("\n");
                }
            }
            else { // 문자열 길이가 홀수일 경우 무조건 NO
                //sb.append("홀수 : ").append(" ");
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);
    }
}