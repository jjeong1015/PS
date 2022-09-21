// 문자열 길이 구할 땐 .length() -> () 꼭 넣기
import java.io.*;
import java.util.*;
public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static String jh, doctor;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        jh = br.readLine();
        doctor = br.readLine();
    }

    static void logic() {
        int jh_length = jh.length();
        int doctor_length = doctor.length();
        if (jh_length >= doctor_length) {
            sb.append("go");
            System.out.println(sb);
        }
        else {
            sb.append("no");
            System.out.println(sb);
        }
    }
}
