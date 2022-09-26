// End of File
import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N, S, result;
    static String blank, input;

    public static void main(String[] args) throws IOException {
        input();
        //logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        //sb = new StringBuilder();
        input = " ";
        //blank = null;
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            N = Integer.parseInt(st.nextToken());
            S = Integer.parseInt(st.nextToken());
            result = S / (N + 1);
            System.out.println(result);
        }
    }
}
