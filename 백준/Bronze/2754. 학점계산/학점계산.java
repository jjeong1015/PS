// 문자열이 들어간 비교 시 .equals 사용
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static String grade;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }
    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        grade = br.readLine();
        //sb.append(grade);
        //System.out.println(sb);
    }
    static void logic() {
        if (grade.equals("A+")) {
            sb.append(4.3);
            System.out.println(sb);
        }
        else if (grade.equals("A0")) {
            sb.append(4.0);
            System.out.println(sb);
        }
        else if (grade.equals("A-")) {
            sb.append(3.7);
            System.out.println(sb);
        }
        else if (grade.equals("B+")) {
            sb.append(3.3);
            System.out.println(sb);
        }
        else if (grade.equals("B0")) {
            sb.append(3.0);
            System.out.println(sb);
        }
        else if (grade.equals("B-")) {
            sb.append(2.7);
            System.out.println(sb);
        }
        else if (grade.equals("C+")) {
            sb.append(2.3);
            System.out.println(sb);
        }
        else if (grade.equals("C0")) {
            sb.append(2.0);
            System.out.println(sb);
        }
        else if (grade.equals("C-")) {
            sb.append(1.7);
            System.out.println(sb);
        }
        else if (grade.equals("D+")) {
            sb.append(1.3);
            System.out.println(sb);
        }
        else if (grade.equals("D0")) {
            sb.append(1.0);
            System.out.println(sb);
        }
        else if (grade.equals("D-")) {
            sb.append(0.7);
            System.out.println(sb);
        }
        else {
            sb.append(0.0);
            System.out.println(sb);
        }
    }
}
