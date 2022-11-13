import java.io.*;

public class Main {
    // https://st-lab.tistory.com/98
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static int result = 0;

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
        for (int i=0; i<N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while (number != 0) {
                sum += number % 10; // 각 자릿수 더하기
                number /= 10;
            }

            if (sum + i == N) { // i값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
                result = i;
                break;
            }
        }
        sb.append(result);
        System.out.println(sb);
    }
}