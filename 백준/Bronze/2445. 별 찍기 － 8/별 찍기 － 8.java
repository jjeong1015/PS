import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
    }

    static void logic() {
        for (int i=1; i<=N; i++) {
            for (int j=0; j<i; j++) {
                sb.append("*");
            }
            for (int j=0; j<2*(N-i); j++) {
                sb.append(" ");
            }
            for (int j=i; j>0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i=N-1; i>0; i--) {
            for (int j=0; j<i; j++) {
                sb.append("*");
            }
            for (int j=0; j<2*(N-i); j++) {
                sb.append(" ");
            }
            for (int j=i; j>0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
