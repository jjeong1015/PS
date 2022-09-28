import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int H, M, temp, temp2;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
    }

    static void logic() {
        sb = new StringBuilder();
        // 45분 일찍 알람 설정하기
        if (M < 45) {
            //temp = M - 45;
            temp = 45 - M;
            temp2 = 60 - temp;
            if (H == 0) {
                H = 24;
                sb.append(H-1).append(" ").append(temp2);
            }
            else {
                sb.append(H-1).append(" ").append(temp2);
            }
            if (M == 60) {
                M = 0;
                H += 1;
            }
        }
        else if (M >= 45 && M <= 59){
            if (H == 0) {
                sb.append(H).append(" ").append(M-45);
            }
            else {
                sb.append(H).append(" ").append(M-45);
            }
        }
        if (M == 60) {
            M = 0;
            H += 1;
            if (H == 0) {
                H = 24;
                sb.append(H).append(" ").append(15);
            }
            else {
                sb.append(H-1).append(" ").append(15);
            }
        }
        System.out.println(sb);
    }
}
