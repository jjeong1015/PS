import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static StringTokenizer st;
    static StringBuilder sb;
    static int n;
    static String name[], ciao[];

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        //sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        name = new String[n];
        ciao = new String[n];
        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            name[i] = st.nextToken(); // 이름
            ciao[i] = st.nextToken(); // 출퇴근

            //sb.append(name[i]).append(" ").append(ciao[i]).append("\n");
        }
        //System.out.println(sb);
    }

    static void logic() {
        sb = new StringBuilder();
        Arrays.sort(name);
        for (int i=n-1; i>0; i--) {
            if(name[i] != null) {
                if (name[i].equals(name[i-1])) {
                    name[i] = null;
                    name[i-1] = null;
                    i++;
                }
                else {
                    sb.append(name[i]).append("\n");
                }
            }
        }
        
        if (name[0] != null) {
            sb.append(name[0]).append("\n");
        }
        System.out.println(sb);

    }
}