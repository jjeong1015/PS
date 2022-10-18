import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int N, num, count;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        count = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            // 소수인 경우 true, 아닌 경우 false
            boolean isPrime = true;
            num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) { // 나머지가 없을 경우 -> 몫이 있음 -> 약수가 존재
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
}