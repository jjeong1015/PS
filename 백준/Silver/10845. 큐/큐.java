import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static String order;
    static Deque<Integer> q = new LinkedList<>();
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
            if (order.contains("push")) {
                N2 = Integer.parseInt(st.nextToken());
                q.offer(N2);
            }
            else if (order.equals("pop")) {
                if(!q.isEmpty()) {
                    sb.append(q.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (order.equals("size")) {
                sb.append(q.size()).append("\n");
            }
            else if (order.equals("empty")) {
                if(q.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if (order.equals("front")) {
                if(!q.isEmpty()) {
                    sb.append(q.element()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if (order.equals("back")) {
                if(!q.isEmpty()) {
                    sb.append(q.peekLast()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
