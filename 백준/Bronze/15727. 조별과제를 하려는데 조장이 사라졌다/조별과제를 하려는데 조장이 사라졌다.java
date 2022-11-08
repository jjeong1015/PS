import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int L;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        L = Integer.parseInt(br.readLine());
    }

    static void logic() {
        if (L % 5 == 0) {
            sb.append(L / 5);
        }
        else {
            sb.append((L / 5) + 1);
        }
        System.out.println(sb);
    }
}
