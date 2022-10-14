import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int Auset, Ausar, Heru;
    static double Auset_pow, Ausar_pow, Heru_pow;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while (true) {
            st = new StringTokenizer(br.readLine());
            Auset = Integer.parseInt(st.nextToken());
            Ausar = Integer.parseInt(st.nextToken());
            Heru = Integer.parseInt(st.nextToken());
            if (Auset == 0 && Ausar == 0 && Heru == 0) {
                break;
            }
            Auset_pow = Math.pow(Auset, 2);
            Ausar_pow = Math.pow(Ausar, 2);
            Heru_pow = Math.pow(Heru, 2);

            if (Heru_pow == (Auset_pow + Ausar_pow)) {
                sb.append("right").append("\n");
            }
            else if (Auset_pow == (Heru_pow + Ausar_pow)) {
                sb.append("right").append("\n");
            }
            else if (Ausar_pow == (Auset_pow + Heru_pow)) {
                sb.append("right").append("\n");
            }
            else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
    }
}
