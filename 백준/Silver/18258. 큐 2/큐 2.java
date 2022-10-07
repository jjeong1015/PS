import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static int N;
    static Deque<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.contains("push")) {
                queue.offer(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.equals("pop")) {
                if(!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
            else if(str.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if(str.equals("empty")) {
                if(queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            }
            else if(str.equals("front")) {
                Integer item = queue.peek();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            }
            else if(str.equals("back")) {
                Integer item = queue.peekLast();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}