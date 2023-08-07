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
        for (int i=1; i<=N; i++) { // ex) N=3 -> 1, 2, 3, 가운데 줄까지 출력
            for (int j=0; j<N-i; j++) { // 첫 번째 줄 : j=0; j<3-1; -> " " 2개
                sb.append(" ");
            }
            for (int j=0; j<2*i-1; j++) { // 첫 번째 줄 : j=0; j<2*1-1; -> "*" 1개
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i=N-1; i>=0; i--) { // ex) N=3 -> 2, 1, 0, 가운데 다음 줄부터 출력
            for (int j=0; j<N-i; j++) { // 첫 번째 줄 : j=0; j<3-1; -> " " 2개
                sb.append(" ");
            }
            for (int j=0; j<2*i-1; j++) { // 첫 번째 줄 : j=0; j<2*1-1; -> "*" 1개
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}