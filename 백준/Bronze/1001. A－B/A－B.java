import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    
    static StringTokenizer st;
    
    static StringBuilder sb;
    
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        sb.append(A-B);
        System.out.println(sb);
    }
}