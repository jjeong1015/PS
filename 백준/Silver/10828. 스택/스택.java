import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static String order;
    static Stack<Integer> s = new Stack<>();

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        int N2 = 0;
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            order = st.nextToken();
            //s.add(order);
            if (order.equals("push")) {
                N2 = Integer.parseInt(st.nextToken());
                s.push(N2);
            }
            else if (order.equals("pop")) {
                if(!s.isEmpty()) {
                    sb.append(s.pop()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (order.equals("size")) {
                sb.append(s.size()).append("\n");
            }
            else if (order.equals("empty")) {
                if(s.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("top")) {
                if(!s.isEmpty()) {
                    sb.append(s.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}